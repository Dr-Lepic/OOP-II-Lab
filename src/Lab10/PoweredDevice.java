package Lab10;

public abstract class PoweredDevice extends Device {
    int ConsumingPower;

    public PoweredDevice(String location){
        super(location);
    }

    public int getConsumingPower(){
        if(!power){
            return 0;
        }
        else {
            return ConsumingPower;
        }
    }

    // need to make abstract
    protected abstract void increasePower();

    protected abstract void decreasePower();


}
