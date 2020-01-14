package Aulas;

import java.util.*;

public class Aula_20{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite ano que você queira verificar; ");
        
        int ano = input.nextInt();
        
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("O ano é bissexto!!");
        }else{
            System.out.println("O ano não é bissexto!!");
        }
    }
}