package Questao4PortoDigital;

public class Dragao extends Monstro {
    private double dano_extra;
    public Dragao(Double vida, Double poderDeAtaque, Integer nivel) {
            super(vida, poderDeAtaque, nivel);
            this.dano_extra = 1;
        }
    

    @Override //OK
    //Aranhao causa 50*nivel_alvo de dano
    public void arranhao(Dummy alvo) {
        Double vida_alvo = alvo.getVida();
        Double dano = 50.0*this.getNivel();
        alvo.setVida(vida_alvo - dano);
        
    }

    @Override//OK
    public void investida(Dummy alvo) {
        if(this.dano_extra < 1.5){
        this.dano_extra = this.dano_extra + 0.1;
        }
        this.setPoderDeAtaque(this.getPoderDeAtaque()*this.dano_extra);
        
    }

    @Override // OK
    public void mordida(Dummy alvo) {
        this.sangra();
        Double vida_alvo = alvo.getVida();
        Double dano = this.getPoderDeAtaque();
        alvo.setVida(vida_alvo - dano);
    }
    

    
}
