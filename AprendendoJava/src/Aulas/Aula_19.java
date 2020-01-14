package Aulas;

//Caso presise de fazer mais de uma comparação na mesma senteça
//usa-se && que é igual a comparação e.

//Caso presise de fazer mais de uma comparação na mesma senteça
//usa-se || que é igual a comparação ou.


import java.util.*;

public class Aula_19{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe número; ");
        int numero = input.nextInt();
        
        if ((numero % 2 == 0)&&(numero >= 0)){
            System.out.println("O número é par e maior que zero");
        }else if ((numero % 2 == 0)&&(numero <= 0)){
            System.out.println("O número é par e menor que zero");
        }else if ((numero % 2 != 0)&&(numero >= 0)){
            System.out.println("O número é impar e maior que zero");
        }else{
            System.out.println("O número é impar e menor que zero");
        }
      
    }
}