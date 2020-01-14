/*
3.	Faça um programa que leia e valide as seguintes informações:
a.	Nome: maior que 3 caracteres;
b.	Idade: entre 0 e 150;
c.	Salário: maior que zero;
d.	Sexo: 'f' ou 'm';
e.	Estado Civil: 's', 'c', 'v', 'd';
 */
package While;

import java.util.*;

public class Exerc_11 {
    public static void main(String[]args){
    	Scanner input = new Scanner(System.in);

    	boolean entradasCorretas = true;
    	int QuantDeCaractere = 0;
    	
    	//Parte que valida o nome do usuario
    	System.out.println("informe nome; ");
    	String nome = input.nextLine();
    	QuantDeCaractere = nome.length();
    	
    	while(QuantDeCaractere < 3){
    		System.out.println("informe nome; ");
    		nome = input.nextLine();
    		QuantDeCaractere = nome.length();
    		}

    	//Parte que valida a idade
    	System.out.println("informe idade; ");
    	int idade = input.nextInt();
    	
    	while(idade < 0 && idade > 150){
    		System.out.println("informe idade; ");
    		idade = input.nextInt();
    	}

    	//Parte que valida o sálirio
    	System.out.println("informe sálario; ");
    	double salario = input.nextDouble();

    	while(salario <= 0){
    		System.out.println("informe sálario; ");
    		salario = input.nextDouble();
    	}

    	//Parte que valida o sexo
    	System.out.println("informe sexo; ");
    	String sexo = input.next();
    	
    	if (sexo.equals("f") || sexo.equals("m")){
    		boolean entrada = true; 
    		while(entrada){
    			System.out.println("informe sexo; ");
    			sexo = input.next();
                        
    			if (sexo.equals("f") || sexo.equals("m")){
                            entrada = false;
    			}
    		}
    	}

    	//Parte que valida o estado civil
		System.out.println("informe estado Civil; ");
		String EstadoCivil = input.next();

		if (EstadoCivil.equals("s") || EstadoCivil.equals("c") || EstadoCivil.equals("v") || EstadoCivil.equals("d")){
			boolean entrada = true;
			while (entrada){
				System.out.println("informe estado Civil; ");
				EstadoCivil = input.next();
						if (EstadoCivil.equals("s") || EstadoCivil.equals("c") || EstadoCivil.equals("v") || EstadoCivil.equals("d")){

					entrada = false;
				}
			}
		}
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(salario);
		System.out.println(sexo);
		System.out.println(EstadoCivil);
    	}    	

    }
