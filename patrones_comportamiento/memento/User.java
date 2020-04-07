package patrones_comportamiento.memento;



public class User {


    private String name;
    private int age;

    public User(String name, int age) {
        setName(name);
        setAge(age);
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public User getBackUp(){
        return  new User(getName(), getAge());
    }

    public void  restoreBackUp(User user){
        setName(user.getName());
        setAge(user.getAge());
    }

}