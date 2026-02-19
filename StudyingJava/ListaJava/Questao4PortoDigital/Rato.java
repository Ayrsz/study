package Questao4PortoDigital;

public class Rato extends Monstro {

    
    public Rato(Double vida, Double poderDeAtaque, Integer nivel) {
            super(vida, poderDeAtaque, nivel);
        }
    

    @Override
    public void arranhao(Dummy alvo) {
        Double vida_alvo = alvo.getVida();
        Double dano = 10.0*this.getNivel();
        alvo.setVida(vida_alvo - dano); 
        
    }

    @Override
    public void investida(Dummy alvo) {
        if(this.ataques_por_turno < 2){
            this.ataques_por_turno = 2;
        }        
    }

    @Override
    public void mordida(Dummy alvo) {
        this.envenena();
        Double vida_alvo = alvo.getVida();
        Double dano = this.getPoderDeAtaque();
        alvo.setVida(vida_alvo - dano);
        
    }


    @Override
    public String toString() {
        return "Rato " + super.toString();
    }

    
}
