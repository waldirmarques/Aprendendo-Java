/*
7.Faça um programa que leia 5 números e informe o maior número.
*/
package For;

import java.util.*;

public class Exerc_01 {
    public static void main(String[]args){
    	Scanner input = new Scanner(System.in);

    	int maior = 0;

    	for(int i = 1; i <= 5; ++i){
    		System.out.println("Iforme número; ");
    		int numero = input.nextInt();

    		if (maior <= numero){
    			maior = numero;
    		}
    	}
    	System.out.println("Maior número digitado = "+maior);
    }
}
