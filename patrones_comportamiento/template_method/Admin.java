package patrones_comportamiento.template_method;

public class Admin extends User{

    @Override
    void workForm() {
        // TODO Auto-generated method stub
        System.out.println("System admin things");

        
    }
    
    public Admin( String usr, String pass) {
        this.setUserName(usr);
        this.setPassword(pass);
    }

}