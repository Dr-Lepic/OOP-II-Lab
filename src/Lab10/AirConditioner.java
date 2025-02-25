package Lab10;

public class AirConditioner extends PoweredDevice {
    public String fanSpeed;
    public int temperature;

    public AirConditioner(String location){
        super(location);
        fanSpeed = "Low";
        temperature = 30;
        ConsumingPower = 250;
    }

    @Override
    protected void increasePower() {
        ConsumingPower += 250;
    }

    @Override
    protected void decreasePower() {
        if((ConsumingPower - 250) <= 0){
            System.out.println("Cant decrease Further Power");
        }
        else {
            ConsumingPower -= 250;
        }
    }

    public String getFanSpeed(){
        return fanSpeed;
    }
    public int getTemperature(){
        return temperature;
    }

    public void increaseFanSpeed(){
        this.fanSpeed = "High";
        ConsumingPower += 20;
    }

    public void decreaseFanSpeed(){
        this.fanSpeed = "Low";
        ConsumingPower -= 20;
    }

    public void increaseTemperature(){
        if(this.temperature < 33){
            this.temperature++;
            this.decreasePower();
        }
        else {
            System.out.println("Cant increase Temperature further");
        }
    }

    public void decreaseTemperature(){
        if(this.temperature > 25){
            this.temperature--;
            this.increasePower();
        }
        else {
            System.out.println("Cant decrease Temperature further");
        }
    }
}
