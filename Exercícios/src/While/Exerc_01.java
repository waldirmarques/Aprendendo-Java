//Escreva um programa que receba como entrada 25 números e exiba a quantidade
//de números que são pares e positivos
package While;

import java.util.*;

public class Exerc_01{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int contador = 0;
        
        while(i <= 25){
            System.out.println("Informe número; ");
            int numero = input.nextInt();
            
            if (numero % 2 == 0 && numero > 0){
                contador += 1;
            }
            ++i;
        }
        System.out.println("Quantidade de números positivos e pares; "+contador);
    }
}