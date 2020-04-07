package patrones_comportamiento.template_method;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
         * Tempalte Method
         * Define la estructura de un algoritmo en una operación,
         * delegando algunospasos a subclases.
         * Template Mehod permite a las subclases redefinir cietos pasos de un algoritmo
         * sin cambiR L estructura del algoritmo
         */
        loadList();
       Admin user1 = new Admin("usr-admin.09","@urs#F578jN");
       System.out.println(user1.authentiaction());
       System.out.println(user1.getPassword());
       user1.workForm();

       Manager mngr = new Manager("jbuu", "kjb hoi");
       System.out.println(mngr.authentiaction());
       mngr.workForm();

    }

    public static void loadList() {
        List<User> users = new ArrayList<User>();

        users.add(new Admin("usr-admin.09", "@urs#F578jN"));
        users.add(new Manager("g.acuna-mng", "eR6uogb*G"));
        User.setUsers(users);
    }

}