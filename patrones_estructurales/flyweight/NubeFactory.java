package patrones_estructurales.flyweight;

import java.util.HashMap;

public class NubeFactory {

    private HashMap<TipoNube, Nube> nubesMap;

    public NubeFactory() {
        this.nubesMap = new HashMap<TipoNube, Nube>();
    }

    public Nube getNube(TipoNube tipoNube){

        Nube nube = (Nube) this.nubesMap.get(tipoNube);

        if(nube == null){
            nube = new Nube(tipoNube, "imagen.png", 100, 100);
            this.nubesMap.put(tipoNube, nube);

        }
        return nube;
    }

    public int countNubesMap(){
        return this.nubesMap.size();
    }
}