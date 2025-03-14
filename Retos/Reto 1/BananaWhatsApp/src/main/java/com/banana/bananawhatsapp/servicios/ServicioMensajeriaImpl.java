package com.banana.bananawhatsapp.servicios;

import com.banana.bananawhatsapp.exceptions.MensajeException;
import com.banana.bananawhatsapp.exceptions.UsuarioException;
import com.banana.bananawhatsapp.modelos.Mensaje;
import com.banana.bananawhatsapp.modelos.Usuario;
import com.banana.bananawhatsapp.persistencia.IMensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ServicioMensajeriaImpl implements IServicioMensajeria{

    @Autowired
    private IMensajeRepository mr;

    @Override
    public Mensaje enviarMensaje(Usuario remitente, Usuario destinatario, String texto) throws UsuarioException, MensajeException, SQLException {
        Mensaje mensaje  = new Mensaje();
        mensaje.setRemitente(remitente);
        mensaje.setDestinatario(destinatario);
        mensaje.setCuerpo(texto);
        return mr.enviarMensaje(mensaje);
    }
    //To DO: hacer el match
    @Override
    public List<Mensaje> mostrarChatConUsuario(Usuario remitente, Usuario destinatario) throws UsuarioException, MensajeException, SQLException {
        List<Mensaje>  mensajesRemitente =   mr.obtener(remitente);
        List<Mensaje>  mensajesDestinatario =   mr.obtener(destinatario);
        return List.of();
    }

    @Override
    public boolean borrarChatConUsuario(Usuario remitente, Usuario destinatario) throws UsuarioException, MensajeException, Exception {

        return mr.borrarEntre(remitente, destinatario );
    }
}
