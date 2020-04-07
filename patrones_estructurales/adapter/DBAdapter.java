package patrones_estructurales.adapter;

public class DBAdapter implements ISQLConnection {

    private INoSQLConnection noSQL;

    public DBAdapter(INoSQLConnection noSQL) {
        this.noSQL = noSQL;
    }

    public void connect() {
        this.noSQL.connect();
    }

    public String runQuery() {
        return this.noSQL.excecuteSentence();
}
}