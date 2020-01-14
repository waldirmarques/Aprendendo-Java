/* Faça um Programa que verifique se uma letra digitada é "F" ou "M".
 Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

package EstruturaDeDecicao;

import java.util.*;

public class Exerc_03{
    public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.println("Informe sexo com apenas um F/M; ");
	String letra = input.next();
	
	if(letra == "F"){
	    System.out.println(letra+" - Feminino");
	}else if(letra == "M"){
	    System.out.println(letra+" - Masculino");
	}else{
	    System.out.println(letra+"- Sexo inválido");
	}
    }
}