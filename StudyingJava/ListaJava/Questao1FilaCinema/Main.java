package Questao1FilaCinema;

public class Main {
    public static void main(String[] args){
        Queue<Pessoa> queue = new Queue<>(5);

        queue.push(new Crianca(5, "Crianca1"));
        queue.push(new Crianca(8, "Crianca2"));
        queue.push(new Crianca(3, "Crianca3"));
        queue.push(new Crianca(6, "Crianca4"));
        queue.push(new Crianca(10, "Crianca5"));
        queue.push(new Adulto(35, "Adulto1"));
        queue.push(new Adulto(40, "Adulto2"));
        queue.push(new Adulto(28, "Adulto3"));
        queue.push(new Adulto(55, "Adulto4"));
        queue.push(new Adulto(60, "Adulto5"));

        while(!queue.isEmpty()){
            System.out.println(queue.pop().toString());
        }
    }
}
