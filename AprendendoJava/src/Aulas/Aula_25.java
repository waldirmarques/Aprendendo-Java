/*
Break serve para parar quando determinada condição for satisfeita
continue serve para continuar o código caso a condição do break
não foi concedida.
 */
package Aulas;

import java.util.*;

public class Aula_25 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe número ; ");
        int numero = input.nextInt();
        
        for(int i = 1; i <= 10; ++i){
            
            if(numero == i){
                System.out.println("Numero escolhido = "+i);
                break;
            }else{
                System.out.println("Numero não escolhido corretamete = "+i);
                continue;
            }
        }
    }
}
