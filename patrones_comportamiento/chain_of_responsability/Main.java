package patrones_comportamiento.chain_of_responsability;

public class Main {

        public static void main(String[] args) {
            
            /**
             *  Chain of Responsability
             *  Permite establecer uuna cadena de objetos receptores a
             * través de de los cuales se pasa una petición formulada
             * por un objeto emisor
             */
            Transaccion transaccion = new Transaccion(200f, 590.67f, ETipoTRansaccion.Reembolso);

            IManejador desposito =new Deposito();
            IManejador retiro =new Retiro();
            IManejador reembolso = new Reembolso();

            desposito.setNextManejador(retiro);
            retiro.setNextManejador(reembolso);

            desposito.ejecutarTransaccion(transaccion);



        }
}