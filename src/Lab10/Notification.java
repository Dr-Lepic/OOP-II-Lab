package Lab10;

public class Notification implements INotification {
    private Boolean activateStatus;

    @Override
    public void sendNotification(String message) {
        ControlCenter controlCenter = ControlCenter.getInstance();
        controlCenter.notifications.add(message);
    }

    public void activate(){
        this.activateStatus = true;
    }
    public void deactivate(){
        this.activateStatus = false;
    }
}
