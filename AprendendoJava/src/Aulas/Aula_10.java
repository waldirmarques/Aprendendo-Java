package Aulas;

import java.util.Scanner;

public class Aula_10{
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       
       double base, altura, resultado;
       
       System.out.println("Informa a base do objeto; ");
       base = input.nextDouble();
       System.out.println("Informe altura do objeto; ");
       altura = input.nextDouble();
       resultado = base*altura;
       System.out.println("Resutado; "+ resultado);
    }
}