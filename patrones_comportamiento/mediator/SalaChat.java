package patrones_comportamiento.mediator;

import java.util.HashMap;

public class SalaChat {

    private HashMap<String, Usuario> usuarios;

    public SalaChat() {
        this.usuarios = new  HashMap<String, Usuario>(); 
    }

    public void addParticipantes(Usuario usuario){
        this.usuarios.put(usuario.getNombre(), usuario);
    }

    public void  enviarMensaje(Usuario remitente, Usuario  receptor , String mensaje){
        if( this.usuarios.get(remitente.getNombre()) !=null &&  this.usuarios.get(receptor.getNombre()) !=null){
            mensaje = String.format("De: %s  \nMensaje: %s ", remitente.getNombre(), mensaje);
            receptor.recibirMensaje(mensaje);
        }
    }

}