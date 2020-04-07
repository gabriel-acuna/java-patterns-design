package patrones_comportamiento.chain_of_responsability;

public class Retiro implements IManejador {

    private IManejador next;



    public void setNextManejador(IManejador manejador){
        this.next = manejador;
    }

    public void ejecutarTransaccion(Transaccion transaccion){
        if(transaccion.getTipoTransaccion() == ETipoTRansaccion.Retiro){
            float cantidad = transaccion.getCantidad() - transaccion.getBalance();
            System.out.println("Su balance despues del retiro es: "+cantidad);

        }else{
            this.next.ejecutarTransaccion(transaccion);
        }

    }
}
