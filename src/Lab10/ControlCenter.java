package Lab10;

import java.util.ArrayList;

public class ControlCenter {
    private static ControlCenter controlCenter;

    public ArrayList<String> notifications;
    public ArrayList<PoweredDevice> poweredDevices;
    public ArrayList<SecurityDevice> securityDevices;
    public ArrayList<SensoryDevice> sensoryDevices;

    private ControlCenter() {
        this.notifications = new ArrayList<>();
        this.poweredDevices = new ArrayList<>();
        this.securityDevices = new ArrayList<>();
        this.sensoryDevices = new ArrayList<>();
    }

    public static ControlCenter getInstance() {
        if(controlCenter == null){
            controlCenter = new ControlCenter();
        }
        return controlCenter;
    }

    public void addPoweredDevice(PoweredDevice poweredDevice){
        poweredDevices.add(poweredDevice);
    }
    public void addSecurityDevice(SecurityDevice securityDevice){
        securityDevices.add(securityDevice);
    }
    public void addSensoryDevice(SensoryDevice sensoryDevice){
        sensoryDevices.add(sensoryDevice);
    }

    public void getNotifications(){
        for(String n : notifications) {
            System.out.println(n);
        }
    }

    public PoweredDevice getPoweredDevice(int pos){
        return poweredDevices.get(pos);
    }
    public SecurityDevice getSecurityDevice(int pos){
        return securityDevices.get(pos);
    }
    public SensoryDevice getSensoryDevice(int pos){
        return sensoryDevices.get(pos);
    }

}
