package com.myshoppingcart.persistence;

import com.myshoppingcart.exception.UsuarioNotFoundException;
import com.myshoppingcart.model.Usuario;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioDBRepository implements IUsuarioRepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    public boolean existeUsuario(String email, String pass) throws Exception {
        return false;
    }

    @Override
    public Usuario getUsuario(String email, String pass) throws UsuarioNotFoundException, Exception {
        return null;
    }

    @Override
    public List<Usuario> getUsuarios(String iniciales) throws Exception {
        return List.of();
    }

    @Override
    public Usuario insertUsuario(Usuario nuevoUsuario) throws Exception {
        return null;
    }

    @Override
    public Usuario updateUsuario(Usuario unUsuario) throws Exception {
        return null;
    }

    @Override
    public boolean deleteUsuario(Integer uid) throws Exception {
        return false;
    }
}
