package Questao1FilaCinema;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Queue <T extends Pessoa> {
    private List<T> pessoas;

    public Queue(int size){
        this.pessoas = new ArrayList<T>(size);
    }
    public Queue(){
        this.pessoas = new ArrayList<T>(10);
    }

    public void push(T pessoa){

        this.pessoas.add(pessoa);
        this.pessoas.sort(Comparator.reverseOrder());    
    }

    public T pop(){
        T proximo = pessoas.getFirst();
        pessoas.remove(0);
        return proximo;
    }

    public boolean isEmpty(){
        return pessoas.isEmpty();
    }
}
