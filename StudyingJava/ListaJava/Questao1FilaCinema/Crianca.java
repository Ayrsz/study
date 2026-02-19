package Questao1FilaCinema;

public class Crianca extends Pessoa{

    public Crianca(int age, String name){
        super(age, name);
    }

    public Ticket getTicketType(){
        return Ticket.CRIANCA;
    }
}
