package Questao3TvInteligente;

public class SmartLamp implements SmartDevice{
    private boolean on;
    private String color;
    private int intensity;

    public SmartLamp(){
        this.on = false;
        this.color = "None";
        this.intensity = 0;
    }

    public void changeColor(String color, int intensity){
        this.color = color;
        this.intensity = intensity;
    }

    public void changeColor(String color){
        this.color = color;
        this.intensity = 100;
    }



    public String getStatus() {
        String estado;
        if (this.isOn()){
            estado = "ligado";
        }
        else{
            estado = "desligado";
        }
        return "O dispositivo está " + estado + ", com cor: "  + color + " de intensidade "+ intensity + ".";
    }
    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void turnOff() {
        this.on = false;
        this.color = "None";
        this.intensity = 0;      
    }


    @Override
    public void turnOn() {
        this.on = true;
        this.color = "White";
        this.intensity = 50;        
    }
}
