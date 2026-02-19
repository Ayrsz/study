package Questao4PortoDigital;
import java.util.ArrayList;
import java.util.Random;

public abstract class Monstro{

    protected Double vida;
    protected String estado;
    protected Double poderDeAtaque;
    protected Integer nivel;
    protected int ataques_por_turno;
    protected int speed;
    //Vetor de ataques
    protected ArrayList<Integer> vetor_ataques;

    

    public ArrayList<Integer> getVetor_ataques() {
        return vetor_ataques;
    }

    public void add_attack(int index_attack){
        vetor_ataques.addLast(index_attack);
    }
    // Construtor da classe abstrata
    public Monstro(Double vida, Double poderDeAtaque, Integer nivel) {
        this.vida = vida;
        this.poderDeAtaque = poderDeAtaque;
        this.nivel = nivel;
        this.estado = "Normal";
        this.ataques_por_turno = 1;  
        this.vetor_ataques = new ArrayList<Integer>();
    }

    public int getAtaques_por_turno() {
        return ataques_por_turno;
    }

    public void setAtaques_por_turno(int ataques_por_turno) {
        this.ataques_por_turno = ataques_por_turno;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean aindaVive(){
        if (vida <= 0){
            return false;
        }
        else return true;
    };

    @Override
    public String toString() {
        return "Monstro [vida=" + vida + ", estado=" + estado + ", poderDeAtaque=" + poderDeAtaque + ", nivel=" + nivel
                + ", ataques_por_turno=" + ataques_por_turno + ", speed=" + speed +  ", vetor_ataques" + vetor_ataques+ "]";
    }

    public void sangra() {
        this.estado = "Sangramento";
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(Double poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void aterroriza() {
        this.estado = "Aterrorizante";
    }

    public void envenena() {
        this.estado = "Venenoso";
    }


    public void attack(Dummy alvo){
        Random random = new Random();
        int ataques_nesse_turno = ataques_por_turno;

        while(this.vetor_ataques.size() < ataques_nesse_turno){
            Integer ataque = random.nextInt(3);
            this.add_attack(ataque);

            
        }

        for(int i = 0; i < vetor_ataques.size(); i++){
            Integer ataque = this.vetor_ataques.removeFirst();
            switch(ataque){
                case 0: 
                this.mordida(alvo);
                break;
                case 1: 
                this.arranhao(alvo);
                break;
                case 2: 
                this.investida(alvo);
                break;
                default:
                    System.out.println("Rapaz...");
            }
        }
        alvo.setEstado(this.estado);
    }

    public abstract void mordida(Dummy alvo);

    public abstract void arranhao(Dummy alvo);

    public abstract void investida(Dummy alvo);



}