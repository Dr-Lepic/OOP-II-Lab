package Lab10;

public class Device {
    Boolean power;
    String location;

    public Device(String location) {
        this.power = false;
        this.location = location;
    }

    public void turnON(){
        power = true;
    }
    public void turnOFF(){
        power = false;
    }

    public String getLocation(){
        return location;
    }
}
