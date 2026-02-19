package Questao2GerenciaCafeteria;

public class Bebida extends Produto{
    private double volume;

    public Bebida(int id, String nome, double preco, int estoque, double volume) throws QuantidadeInvalidaException{
        super(id, nome, preco, estoque);
        this.volume = volume;
    }



    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }



    @Override
    public String toString() {
        return "Bebida [id=" + id + ", nome=" + nome + ", volume=" + volume +  ", preco=" + preco + ", estoque="
                + estoque + ", getVolume()=" + getVolume() + "]";
    }
}
