package Aulas;

import java.util.Arrays;

public class Aula_31{
    public static void main(String[]args){
        
        int vetor[] = {1,2,3,6,5,4,7};
        int aux;
        boolean controle;
        
        for(int i = 0; i < vetor.length; ++i){
            controle = true;
            for(int j = 0; j < (vetor.length - 1); ++j){
                
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    controle = false;
            }
            }
            if(controle){
                break;
            }
        }
        System.out.println(Arrays.toString(vetor));
        
        
    }
}
