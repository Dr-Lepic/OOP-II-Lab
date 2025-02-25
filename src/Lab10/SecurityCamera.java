package Lab10;

public class SecurityCamera extends SecurityDevice{
    public Boolean autoSave;

    public SecurityCamera(String location){
        super(location);
        autoSave = true;
    }

    public void setAutoSave(Boolean autoSave){
        this.autoSave = autoSave;
    }
}
