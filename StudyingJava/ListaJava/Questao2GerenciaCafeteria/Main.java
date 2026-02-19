package Questao2GerenciaCafeteria;

import java.util.ArrayList;


public class Main {
    public static void main() {
        try{
            Cafeteria cafeteria = new Cafeteria();
            // Ingredientes de macarrão
            ArrayList<String> ingredientes = new ArrayList<>();
      
            ArrayList<Produto> produtos = new ArrayList<>();

            
             produtos.add(new Bebida(0, "Pepsi", 4, 2, 350));
             produtos.add(new Bebida(1, "Coca-Cola", 5, 10, 500));
             produtos.add(new Bebida(2, "Suco de Laranja", 3, 8, 300));
             produtos.add(new Bebida(3, "Água", 1, 50, 600));
             produtos.add(new Bebida(4, "Cerveja", 6, 20, 400));
             produtos.add(new Bebida(5, "Energético", 7, 15, 250));
            
            ingredientes.add("soja");
            ingredientes.add("leite");
            produtos.add(new Comida(3, "Macarrão", 8, 100, ingredientes));
            System.out.println(ingredientes);

            ingredientes.clear();
            System.out.println(ingredientes);


            ingredientes.add("Massa");
            ingredientes.add("Queijo");
            ingredientes.add("Presunto");
            produtos.add(new Comida(4, "Pizza", 15, 50, ingredientes));
            ingredientes.clear();

            ingredientes.add("Farinha");
            ingredientes.add("Ovo");
            ingredientes.add("Açúcar");
            produtos.add(new Comida(5, "Bolo", 10, 30, ingredientes));
            ingredientes.clear();
           
            ingredientes.add("Alface");
            ingredientes.add("Tomate");
            ingredientes.add("Cenoura");
            produtos.add(new Comida(6, "Salada", 5, 40, ingredientes));
            ingredientes.clear();

            ingredientes.add("Pão");
            ingredientes.add("Presunto");
            ingredientes.add("Queijo");
            produtos.add(new Comida(7, "Sanduíche", 7, 60, ingredientes));
            ingredientes.clear();
            
            for(Produto produto: produtos){
                cafeteria.adicionarProduto(produto);
            }


        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
        
        

    }
}
