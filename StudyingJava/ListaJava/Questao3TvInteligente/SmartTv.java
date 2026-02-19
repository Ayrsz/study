package Questao3TvInteligente;

public class SmartTv implements SmartDevice{
    private boolean on;
    private int channel;

    public SmartTv(){
        this.on = false;
        this.channel = -1;
    }

    void changeChannel(int channel){
        this.channel = channel;
    }


    @Override
    public String getStatus() {
        String estado;
        if (this.isOn()){
            estado = "ligado";
        }
        else{
            estado = "desligado";
        }
        return "O dispositivo está " + estado + ", no canal: " + channel + ".";
    }


    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void turnOff() {
        this.on = false; 
        this.changeChannel(-1);       
    }

    @Override
    public void turnOn() {
        this.on = true;        
        this.changeChannel(1);
    }

}
