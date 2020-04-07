package patrones_estructurales.adapter;

public class MongoDBConnection implements INoSQLConnection{

    public void connect(){
        System.out.println("MongoDB connection established");
    }

    public String excecuteSentence(){
        return "MongoDB query";
    }

}