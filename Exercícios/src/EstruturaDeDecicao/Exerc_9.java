//Faça um Programa que leia três números e mostre-os em ordem decrescente.

package EstruturaDeDecicao;

import java.util.*;

public class Exerc_9{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe número; ");
        int num1 = input.nextInt();
        System.out.println("Informe número; ");
        int num2 = input.nextInt();
        System.out.println("Informe número; ");
        int num3 = input.nextInt();
        
       if ((num1 > num2) && (num2 > num3)){
            System.out.println("inverso; "+num1+" "+num2+" "+num3);
        }
       else if ((num1 > num3) && (num3 > num2)){
            System.out.println("inverso; "+num1+" "+num3+" "+num2);
        }
       else if ((num2 > num3) && (num3 > num1)){
            System.out.println("inverso; "+num2+" "+num3+" "+num1);
        }
       else if ((num2 > num1) && (num1 > num3)){
            System.out.println("inverso; "+num2+" "+num1+" "+num3);
       }           
       else if ((num3 > num1)&&(num1 > num2)){
            System.out.println("inverso; "+num3+" "+num1+" "+num2);
        }
       else if((num3 > num2)&&(num2 > num1)){
            System.out.println("inverso; "+num3+" "+num2+" "+num1);
       }
    }
}