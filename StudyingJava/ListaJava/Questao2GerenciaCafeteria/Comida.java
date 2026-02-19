package Questao2GerenciaCafeteria;
import java.util.List;
public class Comida extends Produto{
    private List<String> ingredientes;
    
    public Comida(int id, String nome, double preco, int estoque, List<String> ingredientes) throws QuantidadeInvalidaException{
        super(id, nome, preco, estoque);
        this.ingredientes = ingredientes; 
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Comida [id=" + id + ", nome=" + nome + ", ingredientes=" + ingredientes + ", preco=" + preco
                + ", estoque=" + estoque + "]";
    }
    
}
