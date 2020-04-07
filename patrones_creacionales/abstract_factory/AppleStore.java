package patrones_creacionales.abstract_factory;

public class AppleStore implements IAbstractFactory{

    public IComputadora crearComputadora(){
        return new MacBookPro();
    }
    
    public ITablet crearTablet() {
        return new IPad();
    }

}