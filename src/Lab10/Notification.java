package Lab10;

public class Notification implements INotification {
    private Boolean activate;

    @Override
    public void sendNotification(String message) {
        ControlCenter controlCenter = ControlCenter.getInstance();
        controlCenter.notifications.add(message);
    }

    public void activate(){
        this.activate = true;
    }
    public void deactivate(){
        this.activate = false;
    }
}
