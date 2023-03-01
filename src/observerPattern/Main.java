package observerPattern;

public class Main {
    public static void main(String[] args) {
        NewsAgency subject = new NewsAgency();

        NewsSubscriber observer1 = new NewsSubscriber("Aman", subject);
        NewsSubscriber observer2 = new NewsSubscriber("Rathod", subject);
        NewsSubscriber observer3 = new NewsSubscriber("Singh", subject);

        subject.setNews("Observer design pattern implemented");
    }
}
