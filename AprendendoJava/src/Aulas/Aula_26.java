package Aulas;

import java.util.Scanner;

public class Aula_26{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selecione um número de 1 a 5; ");
        int numero = input.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("Você esolheu o número 1");
                break;
            case 2:
                System.out.println("Você esolheu o número 2");
                break;
            case 3:
                System.out.println("Você esolheu o número 3");
                break;
            case 4:
                System.out.println("Você esolheu o número 4");
                break;
            case 5:
                System.out.println("Você esolheu o número 5");
                break;
            default:
                System.out.println("Número não suportado");
        }
    }
}