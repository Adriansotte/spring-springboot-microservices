package com.banana.bananawhatsapp.persistencia;

import com.banana.bananawhatsapp.modelos.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.Set;

@Repository("UsuarioJPARepository")
public class UsuarioJPARepository implements IUsuarioRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Usuario obtener(int id) throws SQLException {
        return em.find(Usuario.class, id);
    }

    @Override
    @Transactional
    public Usuario crear(Usuario usuario) throws SQLException {
        em.persist(usuario);
        return usuario;
    }

    @Override
    @Transactional
    public Usuario actualizar(Usuario usuario) throws SQLException {
        return em.merge(usuario);
    }

    @Override
    @Transactional
    public boolean borrar(Usuario usuario) throws SQLException {
        em.remove(em.contains(usuario) ? usuario : em.merge(usuario));
        return true;
    }

    //To Do
    @Override
    public Set<Usuario> obtenerPosiblesDestinatarios(Integer id, Integer max) throws SQLException {

        return Set.of();
    }
}
