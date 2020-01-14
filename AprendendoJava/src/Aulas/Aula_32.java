package Aulas;

import java.util.Arrays;

public class Aula_32 {
    public static void main(String[]args){
        
        int vetorMut[][] = new int[3][3];
        
        vetorMut[0][0] = 23;
        vetorMut[0][1] = 45;
        vetorMut[0][2] = 5;
        vetorMut[1][0] = 3;
        vetorMut[1][1] = 4;
        vetorMut[1][2] = 67;
        vetorMut[2][0] = 2;
        vetorMut[2][1] = 56543;
        vetorMut[2][2] = 777;
        
        for(int i = 0; i < vetorMut.length; ++i){
            for(int j = 0; j < vetorMut[i].length; ++j){
                System.out.print(i + "|" + j + " = " + vetorMut[i][j] + "\t");
            }
            System.out.println("\n");
        }
        
    }
}
