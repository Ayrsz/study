package Questao1FilaCinema;

enum Ticket{
    ADULTO,
    CRIANCA
}

//
public abstract class Pessoa implements Comparable<Pessoa>{

    protected int age;
    protected String name;
    
    public Pessoa(int age, String name){
        this.age = age;
        this.name = name;
    }

    public abstract Ticket getTicketType();

    public String getName(){
        return this.name;
    }
      
    public int getAge(){
        return this.age;
    }

    public String toString(){
        return name + ":" + "(" + age + ")" + getTicketType();
    }

    public int compareTo(Pessoa pessoa){
        if (pessoa.getAge() > this.getAge()){
            return -1;
        }
        else if(pessoa.getAge() < this.getAge()){
            return 1;
        }
        else{
            return 0;
        }
    }

}
