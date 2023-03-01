package observerPattern;

public class NewsSubscriber implements Observer {
    private String name;
    private NewsAgency agency;

    public NewsSubscriber(String name, NewsAgency agency) {
        this.name = name;
        this.agency = agency;
        agency.registerObserver(this);
    }

    @Override
    public void update() {
        String news = (String) agency.getUpdate(this);
        if (news == null) {
            System.out.println(name + ":: No new message");
        } else
            System.out.println(name + ":: Breaking News::" + news);
    }
}
