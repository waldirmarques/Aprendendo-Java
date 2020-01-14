/*
Faça um programa que receba dois números inteiros e gere os números inteiros
que estão no intervalo compreendido por eles.
Altere o programa anterior para mostrar no final a soma dos números.
*/

package For;

import java.util.*;

public class Exerc_04{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número; ");
        int numInicio = input.nextInt();
        System.out.println("Insira segundo número; ");
        int numTermino = input.nextInt();
        
        int soma = 0;
        
        for(int i = numInicio; i <= numTermino; ++i){
            soma += i;
        }
        System.out.println(soma);
    }
}