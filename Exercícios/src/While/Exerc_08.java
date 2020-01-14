/*
5.	Altere o programa anterior permitindo ao usuário informar
as populações e as taxas de crescimento iniciais. Valide a
entrada e permita repetir a operação.
 */
package While;

import java.util.*;

public class Exerc_08{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);

		System.out.println("informe a população do pais A; ");
		double paisA = input.nextDouble();
		System.out.println("informe a população do pais B; ");
		double paisB = input.nextDouble();
		System.out.println("Digite taxa de crecimento do pais A; ");
		double percentagemA = input.nextDouble();
		System.out.println("Digite taxa de crecimento do pais B; ");
		double percentagemB = input.nextDouble();
		int anos = 0;

		if(paisA < paisB){
			while(paisA <= paisB){
				paisA = paisA + (paisA*percentagemA/100);
				paisB = paisB + (paisB*percentagemB/100);
				++anos;
			}
		}
		else{
			while(paisB <= paisA){
				paisB = paisB + (paisB*percentagemB/100);
				paisA = paisA + (paisA*percentagemA/100);
				++anos;
			}
		}		
		System.out.println("Anos necessarios = "+anos);
	}
}
