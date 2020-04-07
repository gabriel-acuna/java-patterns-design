package patrones_estructurales.adapter;

public interface ISQLConnection {

    void connect();
    String runQuery();

}