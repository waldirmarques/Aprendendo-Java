// do while apresenta primeiro o comando depois o comtrole

package Aulas;

import java.util.*;

public class Aula_22{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int x = 1;
        do{
            System.out.println(x);
            ++x;
        }while(x<=10);
    }
}