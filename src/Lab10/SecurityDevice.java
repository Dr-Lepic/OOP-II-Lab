package Lab10;


public class SecurityDevice extends Device {
    public Boolean status;
    public SecurityDevice(String location) {
        super(location);
        status = true;
    }

    public void activateDevice(){
        status = true;
    }
    public void deactivateDevice(){
        status = false;
    }
}
