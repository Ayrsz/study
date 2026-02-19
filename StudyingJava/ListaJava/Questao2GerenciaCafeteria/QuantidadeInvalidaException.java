package Questao2GerenciaCafeteria;

public class QuantidadeInvalidaException extends Exception {
    public QuantidadeInvalidaException(int quantidade){
        String mensagem = "Insira uma quantidade maior que 0 ou que esteja disponivel no estoque, valor recebido: " + quantidade; 
        super(mensagem);
    }
}
