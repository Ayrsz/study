package Questao3TvInteligente;
import java.util.ArrayList;


public class SmartHomeHub {
    private ArrayList<SmartDevice> devices;

    public SmartHomeHub(){
        this.devices = new ArrayList<SmartDevice>();
    }

    public void addDevice(SmartDevice device){
        this.devices.add(device);
    } 
    public void turnAllOn(){
        for(SmartDevice device : devices){
            device.turnOn();
        }

    }
    public void turnAllOff(){
        for(SmartDevice device : devices){
            device.turnOff();
        }
    }
    public void showStatus(){
        
        for(SmartDevice device : devices){
            System.out.println(device.getStatus());
        }
    }
}
