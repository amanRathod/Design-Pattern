package observerPattern.Observable;

import observerPattern.Observer.NewsSubscriber;
import observerPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<NewsSubscriber> subscribers;
    private String news;
    private boolean changed;
    private final Object MUTEX= new Object();

    public NewsAgency(){
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(NewsSubscriber sub) {
        if (sub == null) throw new NullPointerException("Null Subscriber");
        // synchronized is used for thread safe
        synchronized (MUTEX) {
            if(!subscribers.contains(sub))
                subscribers.add(sub);
        }
    }

    @Override
    public void removeObserver(NewsSubscriber sub) {
        synchronized (MUTEX) {
            subscribers.remove(sub);
        }
    }

    @Override
    public void notifyObserver() {
        List<Observer> observersLocal = null;

        //synchronization is used to make sure any observer registered after news is received is not notified
        synchronized (MUTEX) {
            if (!changed) return;
            observersLocal = new ArrayList<>(this.subscribers);
            this.changed = false;
        }

        for (Observer sub: observersLocal) {
            sub.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.news;
    }

    public void setNews(String news) {
        this.news = news;
        this.changed=true;
        notifyObserver();
    }
}