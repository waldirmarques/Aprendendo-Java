package exercícios;

import java.util.*;

public class Exerc_07{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe quantidade de alunos; ");
        int alunos = input.nextInt();
        
        int vetorNotas[][] = new int[alunos][3];
        
        for(int i = 0; i < alunos; ++i){
            System.out.println();
            System.out.println((i+1)+"° Aluno");
            System.out.println();
            for(int j = 0; j < 3; ++j){                
                System.out.println("Informe "+(j+1)+"° nota; ");
                vetorNotas[i][j] = input.nextInt();
            }
            System.out.println();
            
        }
        for(int i = 0; i < vetorNotas.length; ++i){
            for(int j = 0;j < vetorNotas[i].length;++j){
                System.out.println((i+1)+"° aluno: notas; "+vetorNotas[i][j]);
            }
            System.out.println();
        }
    }
}
