package patrones_estructurales.virtual_proxy;



public class ProxyServicio implements IServicio{

    private IServicio servicio; // costoso
    private Usuario usuario;

    public ProxyServicio( Usuario usuario) {
    
        this.usuario = usuario;
    }

    private IServicio obteneServicio(){
        if(this.servicio==null){
            this.servicio  = new Servicio();
        }
        return this.servicio;
    }
    public void leer(){
       this.obteneServicio().leer();
    }

    public void escribir(){

      if(isAdmin()){
          obteneServicio().escribir();
      }else{
        throw new  UnsupportedOperationException("Operación denegada");
       }
    }

    public void actualizar(){
        if(isAdmin()){
            obteneServicio().actualizar();
        }else{
            throw new  UnsupportedOperationException("Operación denegada");
           }

    }

    public void eliminar(){
       if(isAdmin()){
           obteneServicio().eliminar();
       }else{
        throw new  UnsupportedOperationException("Operación denegada");
       }

    }

    public boolean isAdmin(){
        return this.usuario.getNivelPermiso() >=5;
    }
}