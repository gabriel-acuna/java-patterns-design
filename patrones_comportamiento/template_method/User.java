package patrones_comportamiento.template_method;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

public abstract class User {

    static List<User> users;

    private String userName;
    private String password;

    /**
     * @param users the users to set
     */
    public static void setUsers(List<User> users) {
        User.users = users;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public  void setPassword(String password) {   

            String hash = null;
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-512");
                digest.reset();
                digest.update(password.getBytes("utf8"));
                hash = String.format("%0128x", new BigInteger(1, digest.digest()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            this.password = hash;
            

    }
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean authentiaction() {
        boolean response = false;
        for (final User user : users) {
           
            if (user.userName.equals(userName) && user.password.equals(password))
             {
                response = true;
            }

        }
        return response;
    }

    abstract void workForm();

}