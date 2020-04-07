package  patrones_estructurales.adapter;
public class MySQLConnection implements ISQLConnection{ 

    public void connect(){
        System.out.println("MySql connection established");
    }

    public String runQuery(){
        return "MySql query";
    }
}