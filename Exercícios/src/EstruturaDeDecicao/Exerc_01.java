/*Faça um Programa que peça dois números e imprima o maior deles.*/

package EstruturaDeDecicao;

import java.util.*;

public class Exerc_01{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número; ");
        int num1 = input.nextInt();
        System.out.println("Informe segundo número; ");
        int num2 = input.nextInt();
        
        if (num1 > num2){
            System.out.println("O primeiro número é maior!");
        }else if(num1 == num2){
            System.out.println("Os números são iguais!");
        }else{
            System.out.println("O segundo número é maior!");
        }
                
    }
}