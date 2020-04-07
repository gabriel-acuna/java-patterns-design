package patrones_comportamiento.chain_of_responsability;

public class Deposito implements IManejador {

    private IManejador next;



    public void setNextManejador(IManejador manejador){
        this.next = manejador;
    }

    public void ejecutarTransaccion(Transaccion transaccion){
        if(transaccion.getTipoTransaccion() == ETipoTRansaccion.Deposito){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("Su balance despues del depósito es: "+cantidad);

        }else{
            this.next.ejecutarTransaccion(transaccion);
        }

    }

}