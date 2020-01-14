/*2.	Faça um Programa que peça um valor e mostre na tela se o valor
 é positivo ou negativo.*/

package EstruturaDeDecicao;

import java.util.*;

public class Exerc_02{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
	
	System.out.println("Informe número; ");
	int numero = input.nextInt();
	
	if (numero > 0){
	    System.out.println("Número positivo!");
	}else{
	    System.out.println("Número negativo!");
	}
    }
}