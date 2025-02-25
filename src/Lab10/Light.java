package Lab10;

public class Light extends PoweredDevice{

    String color;
    int brightness;

    public Light(String location){
        super(location);
        color = "White";
        int brightness = 100;
        ConsumingPower = 100;
    }

    @Override
    protected void increasePower(){
        ConsumingPower += 100;
    }
    @Override
    protected void decreasePower(){
        if((ConsumingPower - 100) <= 0){
            System.out.println("Cant decrease Further Power");
        }
        else {
            ConsumingPower -= 100;
        }
    }

    public String getColor(){
        return color;
    }
    public int getBrightness(){
        return brightness;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void increaseBrightness(){
        brightness+= 100;
        this.increasePower();
    }
    public void decreaseBrightness(){
        if(brightness <= 100){
            System.out.println("Cant decrease Further brightness");
        }
        else {
            brightness-=100;
            this.decreasePower();
        }
    }

}
