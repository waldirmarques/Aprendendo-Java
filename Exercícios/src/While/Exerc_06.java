/*1.Faça um programa que peça uma nota, entre zero e dez.
 Mostre uma mensagem caso o valor seja inválido e continue
 pedindo até que o usuário informe um valor válido
*/

 package While;

 import java.util.*;

 public class Exerc_06{
 	public static void main(String[]args){
 		Scanner input = new Scanner(System.in);

 		System.out.println("Informe nota do aluno; ");
 		double nota = input.nextDouble();

 		while(nota < 0 || nota > 10){
 			System.out.println("Valor invalido!");

 			System.out.println(" ");
 			System.out.println("Informe nota do aluno; ");
 		    nota = input.nextDouble();

 		}
 	}
 }