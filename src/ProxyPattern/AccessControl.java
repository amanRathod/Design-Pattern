package ProxyPattern;

public class AccessControl {
    private boolean authorized;

    public AccessControl(boolean authorized) {
        this.authorized = authorized;
    }

    public boolean isAuthorized() {
        return authorized;
    }
}
