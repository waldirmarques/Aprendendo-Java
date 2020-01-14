package Aulas;

import java.util.*;

public class Aula_33{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int turma = 5;
        String nomeAlunos[] = new String[turma];
        double media[] = new double[turma];
        double notas = 0;
        double MediaFinal = 0;
        
        for(int i = 0; i < turma; ++i){
            System.out.println("Informe nome do aluno: ");
            nomeAlunos[i] = input.next();
            System.out.println();
            for(int j = 0; j < 3; ++j){
                System.out.println("Digite notas do aluno "+nomeAlunos[i]);
                notas = input.nextDouble();
                if(notas >= 0 && notas <= 10){
                    MediaFinal += notas;
                }else{
                    System.out.println("Entrada invalida, Informe nota novamente");
                    System.out.println();
                    --j;
                }
            }
            System.out.println();
            media[i] = MediaFinal/3;
            MediaFinal = 0;
        }
        for(int nomes = 0; nomes < nomeAlunos.length; ++nomes){
            System.out.println("Aluno "+nomeAlunos[nomes]);
            if(media[nomes] >= 7 && media[nomes] <= 10){
                
                System.out.println("Aprovado");
                System.out.println("Media final = "+media[nomes]);
                System.out.println();
            }else{
                
                System.out.println("Reprovado");
                System.out.println("Media final = "+media[nomes]);
                System.out.println();
            }
        }
    }
    
}