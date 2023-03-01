package observerPattern;

public interface Subject {
    public void registerObserver(NewsSubscriber sub);
    public void removeObserver(NewsSubscriber sub);
    public void notifyObserver();

    public Object getUpdate(Observer sub);
}
