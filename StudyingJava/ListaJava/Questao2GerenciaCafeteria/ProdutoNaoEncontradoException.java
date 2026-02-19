package Questao2GerenciaCafeteria;

public class ProdutoNaoEncontradoException extends Exception{
    public ProdutoNaoEncontradoException(String nome){
        String mensagem = "Produto " + nome + " nao foi encontrado :(";
        super(mensagem);
    }

}
