package Aulas;

import java.util.*;

public class Aula_18{
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Informe seu nome; ");
       String nome = input.nextLine();
       System.out.println("Iforme sua idade; ");
       int idade = input.nextInt();
       
      if (idade < 1){
          System.out.println("Idade Inválida!!");
      }
      else if(idade < 17){
          System.out.println("Você é de menor "+nome+" por ter "+idade+" anos");
      }
      else{
          System.out.println("Você é de maior "+nome+" por ter "+idade+" anos");
      }
    }
}