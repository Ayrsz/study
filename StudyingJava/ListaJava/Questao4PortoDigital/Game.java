package Questao4PortoDigital;

import java.util.Random;

public class Game{

    public static void main(String[] args){
        Dummy protagonista = new Dummy();
        Monstro monstro = monstro_aleatorio();
        String cor = cor_aleatorio();
        Colorido.color(cor, monstro);
        System.out.println(cor);
        Double vida_monstro = monstro.getVida();
        System.out.println(monstro);
        for(int i = 0; monstro.aindaVive() && protagonista.getVida() > 0; i++){
            monstro.attack(protagonista);
            monstro.setVida(vida_monstro*(1-i*0.1));
            
            System.out.println("Turno " + (i+1));
            System.out.println(protagonista.toString());

            System.out.println(cor + " " + monstro.toString());
        }
        
    }

    public static Monstro monstro_aleatorio(){
        Random random = new Random();
        Integer num = random.nextInt(3);
        Monstro monstro;
        switch(num){
            case 0:
                monstro = new Dragao(10.0, 2500.0, 10);
                break;
            case 1:
                monstro = new Rato(100.0, 2500.0, 10);
                break;            
            case 2:
                monstro = new Lobo(1000.0, 2500.0, 10);
                break;
            default:
                throw new IllegalArgumentException("Numero invalido");
        
        }
        return monstro;
    }

    public static String cor_aleatorio(){
        Random random = new Random();
        Integer num = random.nextInt(4);
        switch(num){
            case 0:
                return "azul";
            case 1:
                return "amarelo";
            case 2:
                return "verde";
            case 3:
                return "roxo";
            default:
                throw new IllegalArgumentException("Numero invalido");
        }       

    }

    }