/*Faça um programa para a leitura de duas notas parciais de um aluno. O programa
deve calcular a média alcançada por aluno e apresentar:
	
	A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
	A mensagem "Reprovado", se a média for menor do que sete;
	A mensagem "Aprovado com Distinção", se a média for igual a dez.
*/

package EstruturaDeDecicao;

import java.util.*;

public class Exerc_05{
    public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.println("Informe primeira nota parcial do aluno; ");
	double primeira_nota = input.nextInt();
	System.out.println("Informe segunda nota parcial do aluno; ");
	double segunda_nota = input.nextInt();

	double media;
        
        media = (primeira_nota + segunda_nota)/2;

	if (media == 10){
	    System.out.println("Aprovado com distinção! "+media);
	}else if (media >= 7){
	    System.out.println("Aprovado! "+media);
	}else{
	    System.out.println("Reprovado! "+media);
	}
    }
}