/*
2.Faça um programa que leia um nome de usuário e a sua senha e
não aceite a senha igual ao nome do usuário, mostrando uma 
mensagem de erro e voltando a pedir as informações.
 */
package While;

import java.util.*;

public class Exerc_10 {
    public static void main(String[]args){
    	Scanner input = new Scanner(System.in);

    	boolean motivoParada = false;

    	while (motivoParada == false){
    		System.out.println("Informe seu nome; ");
    		String nome = input.nextLine();
    		System.out.println("Informe sua senha; ");
    		String senha = input.nextLine();

    		if(nome.equals(senha)){
    			System.out.println("\nDesculpe, entrada invalida!");
    			motivoParada = false;
    		}else{
    			motivoParada = true;
    		}
    	}
    	System.out.println("Você pode proseguir!");
    }
}
