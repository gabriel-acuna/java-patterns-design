package patrones_estructurales.proxy;



public class ProxyServicio implements IServicio{

    private IServicio servicio;
    private Usuario usuario;

    public ProxyServicio(IServicio servicio, Usuario usuario) {
        this.servicio =servicio;
        this.usuario = usuario;
    }

    public void leer(){
       this.servicio.leer();
    }

    public void escribir(){

      if(isAdmin()){
          servicio.escribir();
      }else{
        throw new  UnsupportedOperationException("Operación denegada");
       }
    }

    public void actualizar(){
        if(isAdmin()){
            servicio.actualizar();
        }else{
            throw new  UnsupportedOperationException("Operación denegada");
           }

    }

    public void eliminar(){
       if(isAdmin()){
           servicio.eliminar();
       }else{
        throw new  UnsupportedOperationException("Operación denegada");
       }

    }

    public boolean isAdmin(){
        return this.usuario.getNivelPermiso() >=5;
    }
}