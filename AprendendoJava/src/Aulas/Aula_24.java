package Aulas;

import java.util.*;


public class Aula_24{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Ramdom ramdom = new Ramdom();
        
        boolean acertou = false;
        int tentativas = 10;
        int numeroAleatorio = ramdom.nextInt();
        long chute = 0;
        
        while(tentativas > 0 && acertou == false){
            System.out.println("Qual número vc escolhe; ");
            chute = input.nextLong();
               
            if(numeroAleatorio == chute){
                System.out.println("Parabéns vc acabou de ganhar");
                acertou = true;
            }else if(chute < numeroAleatorio){
                System.out.println("Seu chute foi menor que o número sortiado; ");
                tentativas -= 1;
                System.out.println("Restão ainda "+tentativas+" tentativas");
            }else if(chute > numeroAleatorio){
                System.out.println("Seu chute foi maior que o número sortiado; ");
                tentativas -= 1;
                System.out.println("Restão ainda "+tentativas+" tentativas");
            }
        }
        
    }
}
