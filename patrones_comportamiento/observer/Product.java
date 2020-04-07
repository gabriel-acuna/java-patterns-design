package patrones_comportamiento.observer;
import java.util.LinkedHashSet;
import java.util.Set;

public class Product implements IObservable{

    private String code;
    private String name;
    private int  stock;

    private Set<IObserver> observers;

    public Product(String code, String  name, int stock) {
        setCode(code);
        setName(name);
        setStock(stock);
        this.observers = new LinkedHashSet<>();
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void sell(int items){
        setStock(this.stock - items);
        notifyObservers();
        System.out.println(String.format("%d units of %s has been sold", items, getName()));
    }

    @Override
    public void addObserver(IObserver observer) {
        // TODO Auto-generated method 
        this.observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (IObserver iObserver : observers) {
            String msg = String.format("The product %s --> %s has been sold!", getCode(),getName());
            iObserver.notification(msg);
        }

    }

    @Override
    public void removeObserver(IObserver observer) {
        // TODO Auto-generated method stub

    }

}