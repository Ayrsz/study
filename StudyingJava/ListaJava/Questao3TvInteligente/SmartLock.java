package Questao3TvInteligente;

public class SmartLock implements SmartDevice{
    private boolean on;

    @Override
    public String getStatus() {
        String estado;
        if (this.isOn()){
            estado = "ligado";
        }
        else{
            estado = "desligado";
        }
        return "O dispositivo está " + estado + ".";
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void turnOff() {
        this.on = false;        
    }

    @Override
    public void turnOn() {
        this.on = true;        
    }

}
