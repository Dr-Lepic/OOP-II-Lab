package Lab10;

public class SensoryDevice extends Device{
    public String data;
    public int sensitivity;
    public Notification notification;

    public SensoryDevice(String location){
        super(location);
        notification = new Notification();
        sensitivity = 1;
    }

    public  String  getData(){
        return data;
    }

    public void enableNotification(){
        notification.activate();
    }
    public void disableNotification(){
        notification.deactivate();
    }
    public void sendNotification(String msg){
        notification.sendNotification(msg);
    }
    public void setSensitivity(int sensitivity){
        if(sensitivity < 1 || sensitivity > 10){
            System.out.println("Sensitivity must be between 1 and 10");
        }
        else {
            this.sensitivity = sensitivity;
        }
    }

}
