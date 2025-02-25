package Lab10;

public class SmokeDetector extends SensoryDevice{
    public Boolean sprinkle;

    public SmokeDetector(String location){
        super(location);
        sprinkle = false;
    }

    public void activate(){
        sprinkle = true;
    }
    public void deactivate(){
        sprinkle = false;
    }
}
