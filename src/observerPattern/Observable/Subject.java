package observerPattern.Observable;

import observerPattern.Observer.NewsSubscriber;
import observerPattern.Observer.Observer;

public interface Subject {
    public void registerObserver(NewsSubscriber sub);
    public void removeObserver(NewsSubscriber sub);
    public void notifyObserver();

    public Object getUpdate(Observer sub);
}
