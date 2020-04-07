package patrones_estructurales.adapter;

public interface INoSQLConnection {
     void connect();
     String excecuteSentence();
}