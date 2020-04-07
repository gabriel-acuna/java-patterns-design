package patrones_comportamiento.chain_of_responsability;

public class Reembolso implements IManejador {

    private IManejador next;



    public void setNextManejador(IManejador manejador){
        this.next = manejador;
    }

    public void ejecutarTransaccion(Transaccion transaccion){
        if(transaccion.getTipoTransaccion() == ETipoTRansaccion.Reembolso){
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("Su balance despues del reembolso es: "+cantidad);

        }else{
            System.out.println("Operación no válida");
        }

    }
}
