package Questao1FilaCinema;

public class Adulto extends Pessoa {
    public Adulto(int age, String name){
        super(age, name);
    }

    public Ticket getTicketType(){
        return Ticket.ADULTO;
    }
}
