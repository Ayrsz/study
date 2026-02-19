package Questao2GerenciaCafeteria;

import java.util.ArrayList;

public class Cafeteria <T extends Produto> {
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public void adicionarProduto(Produto produto) throws QuantidadeInvalidaException{
        produtos.add(produto);
    }



    public Produto buscarProdutoPorNome(String Name) throws ProdutoNaoEncontradoException{
     
        for (Produto produto : produtos) {
            if (produto.getNome() == Name) {
                return produto;
            }
        }
        throw new ProdutoNaoEncontradoException(Name);
        
    }

    public void realizarVenda(String nomeProduto, int quantidade) throws QuantidadeInvalidaException{
        Produto produto;
        try {
            produto = this.buscarProdutoPorNome(nomeProduto);
            int estoque_atual_produto = produto.getEstoque();
            int restante = estoque_atual_produto - quantidade;
            
            
            if(restante < 0 || quantidade <= 0){
                throw new QuantidadeInvalidaException(quantidade);
            }
            produto.setEstoque(restante);
            
            System.out.println("Venda realizada: "+ produto.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
