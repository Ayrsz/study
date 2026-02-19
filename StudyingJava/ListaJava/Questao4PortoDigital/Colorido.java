package Questao4PortoDigital;

public class Colorido {
    
    public static void color(String cor, Monstro monstro){

        switch(cor){
            case "azul":
                if(monstro instanceof Dragao){monstro.setVida(monstro.getVida()*1.25);}
                if(monstro instanceof Rato){monstro.envenena();}
                if(monstro instanceof Lobo){monstro.add_attack(2); monstro.add_attack(2);}
                break;
            case "amarelo":
                if(monstro instanceof Dragao){monstro.setPoderDeAtaque(monstro.getPoderDeAtaque()*1.2);}
                if(monstro instanceof Rato){monstro.setSpeed(java.lang.Integer.MAX_VALUE);}
                if(monstro instanceof Lobo){monstro.add_attack(0); monstro.add_attack(0);}
                break;
            case "verde":
                if(monstro instanceof Dragao){monstro.setAtaques_por_turno(2);}
                if(monstro instanceof Rato){monstro.aterroriza();}
                if(monstro instanceof Lobo){monstro.add_attack(1); monstro.add_attack(1);}
                break;
            case "roxo":
                if(monstro instanceof Dragao){monstro.setVida(monstro.getVida()*0.75); monstro.setPoderDeAtaque(monstro.getPoderDeAtaque()* 1.5) ;}
                if(monstro instanceof Rato){monstro.setAtaques_por_turno(3);}
                if(monstro instanceof Lobo){monstro.add_attack(0); monstro.add_attack(1); monstro.add_attack(2);}
                break;
            default:
                System.out.println("Cor inválida");
        }


    }
}
