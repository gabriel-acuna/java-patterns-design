package patrones_comportamiento.chain_of_responsability;

public class Transaccion {

    private float cantidad;
    private float balance;

    private ETipoTRansaccion tipoTransaccion;

    public Transaccion( float cantidad, float balance, ETipoTRansaccion tipoTransaccion) {
        setCantidad(cantidad);
        setBalance(balance);
        setTipoTransaccion(tipoTransaccion);

    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }
    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * @param tipoTransaccion the tipoTransaccion to set
     */
    public void setTipoTransaccion(ETipoTRansaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    /**
     * @return the balance
     */
    public float getBalance() {
        return balance;
    }
    /**
     * @return the cantidad
     */
    public float getCantidad() {
        return cantidad;
    }
    /**
     * @return the tipoTransaccion
     */
    public ETipoTRansaccion getTipoTransaccion() {
        return tipoTransaccion;
    }



}