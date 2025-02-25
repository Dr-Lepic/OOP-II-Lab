package Lab10;

public class HumiditySensor extends SensoryDevice{
    public String settings;
    public HumiditySensor(String location){
        super(location);
    }

    public void setSettings(String settings){
        this.settings = settings;
    }
}
