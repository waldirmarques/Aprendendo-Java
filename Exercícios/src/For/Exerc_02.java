/*
 8.Faça um programa que leia 5 números e informe a soma e a
média dos números.
 */
package For;

import java.util.*;

public class Exerc_02 {
    public static void main(String[]args){
    	Scanner input = new Scanner(System.in);

    	int soma = 0;
    	double media;

    	for(int i = 1; i <= 5; ++i){
    		System.out.println("informe número; ");
    		int numero = input.nextInt();

    		soma += numero;

    	}
    	media = soma/5;

    	System.out.println("Soma dos números = "+soma);
    	System.out.println("Media dos números = "+media);
    }
}
