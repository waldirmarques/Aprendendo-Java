/*
 Escreva um programa que receba como entrada vários números, até que seja
informado o valor 100, e exiba a média dos números pares. (Dica: a média dos
números é calculada dividindo-se sua soma pela quantidade de números.
Porém, como não é possível dividir por zero, se houver dúvida sobre a
quantidade, é preciso testar antes de fazer o cálculo) 
 
 Dados de entrada Resultado esperado 3                        
10 7 100  10 
8  5 4 1 100 6 
7 3 100   Não foram lidos números pares 
 */

package While;

import java.util.*;

public class Exerc_03{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite um número; ");
        int numero = input.nextInt();
        
        int somaDosNumerosPares = 0;
        int contador = 0;
        
        while(numero != 100){
            if (numero % 2 == 0){
                somaDosNumerosPares += numero;
                contador += 1;
            }
            System.out.println("Digite um número; ");
            numero = input.nextInt();
        }
        int mediaDosNumerosPares = somaDosNumerosPares/contador;
        System.out.println("Media dos números pares = "+mediaDosNumerosPares);
    }
}