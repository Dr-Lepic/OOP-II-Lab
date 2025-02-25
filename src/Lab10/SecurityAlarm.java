package Lab10;

public class SecurityAlarm extends SecurityDevice{
    String password;
    Notification notification;
    public SecurityAlarm(String location, String password){
        super(location);
        this.password = password;
    }

    public void verifyPassword(String password){
        if(password.equals(this.password)){
            notification.sendNotification("Password verified");
        }
        else{
            notification.sendNotification("Wrong password");
        }
    }
}
