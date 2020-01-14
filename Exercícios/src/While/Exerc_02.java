//Escreva um programa que receba como entrada 50 números e
//exiba a soma dos que são múltiplos de 3. 

package While;

import java.util.*;

public class Exerc_02{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        int i = 1;
        int somadorMultiplo = 0;
        
        while(i <= 50){
            System.out.println("Digite número; ");
            int numero = input.nextInt();
            
            if (numero % 3 == 0){
                somadorMultiplo += numero;
            }
            ++i;
        }
        System.out.println("Soma dos multiplos de 3; "+somadorMultiplo);
    }
}