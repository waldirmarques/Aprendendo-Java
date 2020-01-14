/*Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
Armazene os números pares no vetor PAR e os números IMPARES no vetor
impar. Imprima os três vetores.
*/

package Listas;

import java.util.*;

public class Exerc_02{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int valores = 10;
		int[] ListaPar = new int[valores];
		int[] ListaImpar = new int[valores];

		for(int i = 0; i < 20; ++i){
			System.out.println("Insira os valores que desejar; ");
			int entrada = input.nextInt();
			
                        if(entrada % 2 == 0){
				ListaPar[i] = entrada;
			}
                        else{
				ListaImpar[i] = entrada;
			}
		}
	}
}
