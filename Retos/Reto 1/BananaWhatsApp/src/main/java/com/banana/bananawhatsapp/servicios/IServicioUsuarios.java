package com.banana.bananawhatsapp.servicios;

import com.banana.bananawhatsapp.exceptions.UsuarioException;
import com.banana.bananawhatsapp.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLException;
import java.util.Set;

public interface IServicioUsuarios  {
    public Usuario obtener(int id) throws UsuarioException;

    public Usuario crearUsuario(Usuario usuario) throws UsuarioException, SQLException;

    public boolean borrarUsuario(Usuario usuario) throws UsuarioException;

    public Usuario actualizarUsuario(Usuario usuario) throws UsuarioException, SQLException;

    public Set<Usuario> obtenerPosiblesDesinatarios(Usuario usuario, int max) throws UsuarioException;
}
