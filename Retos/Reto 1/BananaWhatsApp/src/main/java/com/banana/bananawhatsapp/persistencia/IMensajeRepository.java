package com.banana.bananawhatsapp.persistencia;

import com.banana.bananawhatsapp.modelos.Mensaje;
import com.banana.bananawhatsapp.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLException;
import java.util.List;

//Extends JPA deleted
public interface IMensajeRepository {
    public Mensaje crear(Mensaje mensaje) throws SQLException;

    public List<Mensaje> obtener(Usuario usuario) throws SQLException;

    public boolean borrarEntre(Usuario remitente, Usuario destinatario) throws Exception;

    public boolean borrarTodos(Usuario usuario) throws SQLException;
}
