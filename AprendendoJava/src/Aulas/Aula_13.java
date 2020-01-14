/* Faça um programa que peça do usuario um peso em gramas e converta em quilos
e em gramas.
*/
package Aulas;

import java.util.*;

public class Aula_13{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int gramas, resto_gramas, quilos;
      
        System.out.println("Informe o peso em gramas do produto; ");
        gramas = input.nextInt();
        
        quilos = gramas / 1000;
        resto_gramas = gramas % 1000;
        
        System.out.println("Quantidade em quilos; "+quilos);
        System.out.println("Quantida em gramas; "+resto_gramas);               
        
         }
}