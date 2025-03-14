package com.banana.bananawhatsapp.servicios;

import com.banana.bananawhatsapp.exceptions.UsuarioException;
import com.banana.bananawhatsapp.modelos.Usuario;
import com.banana.bananawhatsapp.persistencia.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ServicioUsuarioImpl implements IServicioUsuarios{

    @Autowired
    private IUsuarioRepository ur;

    @Override
    public Usuario obtener(int id) throws UsuarioException {
        // Se podria hacer con el optional pero hay que cambiar el metodo de la capa de persistencia.
        Usuario usuario = ur.getById(id);
        if(usuario != null) {
            return usuario;
        } else {
            return null;
        }

    }

    @Override
    public Usuario crearUsuario(Usuario usuario) throws UsuarioException, SQLException {
        ur.crear(usuario);
        return usuario;
    }

    @Override
    public boolean borrarUsuario(Usuario usuario) {
        try{
            ur.borrar(usuario);
            return true;
        } catch(SQLException e) {
            return false;
        }

    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) throws UsuarioException, SQLException {
        return ur.actualizar(usuario);
    }

    @Override
    public Set<Usuario> obtenerPosiblesDesinatarios(Usuario usuario, int max) throws UsuarioException {
        return ur.obtenerPosiblesDestinatarios(usuario.getId(), max);
    }
}
