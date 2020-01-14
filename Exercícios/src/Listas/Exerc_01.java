/*
1.	Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
*/

package Listas;

import java.util.*;

public class Exerc_01{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int valorVetor = 10;
		int[]vetorReais = new int[valorVetor];

		for(int i = 0; i < 10; ++i){
			System.out.println("Informe os valores; ");
			int entrada = input.nextInt();
			vetorReais[i] = entrada;
		}
                System.out.println(" ");
		for(int j = 9; j >= 0; --j){
                    System.out.println(vetorReais[j]);
                }
	}
}
