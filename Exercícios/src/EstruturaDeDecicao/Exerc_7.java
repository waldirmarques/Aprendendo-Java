//Faça um Programa que leia três números e mostre o maior e o menor deles.

package EstruturaDeDecicao;

import java.util.*;

public class Exerc_7{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe primeiro número; ");
        int num1 = input.nextInt();
        System.out.println("Informe segundo número; ");
        int num2 = input.nextInt();
        System.out.println("Informe terceiro número; ");
        int num3 = input.nextInt();
        
        if(((num1 > num2) && (num2 > num3)) || ((num1 > num3) && (num3 > num2))){
            System.out.println("Primeiro número é maior "+num1);
        }else if (((num2 > num3) && (num3 > num1)) || ((num2 > num1) && (num1 > num3))){
            System.out.println("Segundo número é maior "+num2);
        }else if (((num3 > num1)&&(num1 > num2)) && ((num3 > num2)&&(num2 > num1))){
            System.out.println("Terceiro número é maior "+num3);
        }
    }
}
