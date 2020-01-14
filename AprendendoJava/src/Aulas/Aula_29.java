/*
 Arreys e vetores são listas...
 */
package Aulas;

import java.util.*;

public class Aula_29 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int numAlunos = 5;
        double[] notas = new double[numAlunos];
        
        for(int i = 0; i < numAlunos; ++i){
            System.out.println("Informe nota do "+(i+1)+"° aluno; ");
            notas[i] = input.nextDouble();
        }
        for(int j = 0; j < numAlunos; ++j){
            System.out.println("\nPrint das notas!!");
            System.out.println(notas[j]);
        }
        
    }
}
