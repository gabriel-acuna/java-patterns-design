package patrones_creacionales.builder;

public class Usuario {
    private String nombre, apellido, email, telefono, dirección;

    boolean medioContacto;

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = "";
        this.telefono = "";
        this.dirección = "";
    }

    public static Usuario Make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);

    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @return the dirección
     */
    public String getDirección() {
        return dirección;
    }

    public Usuario buid() {
        return this;
    }

    /**
     * @param medioContacto the medioContacto to set
     */
    public BuilderUsuario setMedioContacto(boolean medioContacto) {
        if(!medioContacto){
            throw new IllegalArgumentException("No es posible asignar un valor falso a medio de contacto");
        
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nombre: %s \nApellido: %s \nEmail: %s \nTelefono: %s \nDirección: %s", nombre, apellido,
                email, telefono, dirección);
    }

    public static class BuilderUsuario {
        private Usuario user;

        public BuilderUsuario(Usuario user) {
            this.user = user;
        }

        /**
         * @param email the email to set
         */
        public BuilderUsuario setEmail(String email) {
            user.email = email;
            return this;
        }

        /**
         * @param telefono the telefono to set
         */
        public BuilderUsuario setTelefono(String telefono) {
            user.telefono = telefono;
            return this;
        }

        /**
         * @param dirección the dirección to set
         */
        public BuilderUsuario setDirección(String dirección) {
            user.dirección = dirección;
            return this;
        }

        public Usuario build(){
            return user;
        }

    }

}


