package patrones_comportamiento.template_method;

public class Manager  extends User{

    @Override
    void workForm() {
        // TODO Auto-generated method stub

        System.out.println("Manager things");

    }

    public Manager( String usr, String pass) {
        this.setUserName(usr);
        this.setPassword(pass);
    }

}