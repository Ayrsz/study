package Questao4PortoDigital;

public class Lobo extends Monstro{
    private double dano_extra;

    public Lobo(Double vida, Double poderDeAtaque, Integer nivel) {
            super(vida, poderDeAtaque, nivel);
            this.dano_extra = 1;
        }

    @Override
    public void arranhao(Dummy alvo) {
        Double vida_alvo = alvo.getVida();
        Double dano = 0.2*vida_alvo;
        alvo.setVida(vida_alvo - dano);  
        
    }

    @Override
    public void investida(Dummy alvo) {
        if(this.dano_extra < 2){
            this.dano_extra = this.dano_extra + 0.1;
        }
        this.setPoderDeAtaque(this.getPoderDeAtaque()*this.dano_extra);
        
    }

    @Override
    public String toString() {
        return "Lobo " + super.toString();
    }

    @Override
    public void mordida(Dummy alvo) {
        this.aterroriza();
        Double vida_alvo = alvo.getVida();
        Double dano = this.getPoderDeAtaque();
        alvo.setVida(vida_alvo - dano);        
    }
    

    
}
