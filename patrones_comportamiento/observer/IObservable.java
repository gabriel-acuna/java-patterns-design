package patrones_comportamiento.observer;

public interface IObservable {

    void addObserver(IObserver observer);

    void notifyObservers();

    void removeObserver(IObserver observer);

}