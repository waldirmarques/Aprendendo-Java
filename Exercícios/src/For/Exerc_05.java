/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
tabuada. A saída deve ser conforme o exemplo abaixo:

o	Tabuada de 5:
o	5 X 1 = 5
o	5 X 2 = 10
o	...
o	5 X 10 = 50

 */

package For;

import java.util.*;

public class Exerc_05 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual tabuada vc deseja obter (1/10): ");
        int tabuada = input.nextInt();
        System.out.println(" ");
        
        for(int i = 1; i <= 10; ++i){
            int resultado = tabuada * i;
            System.out.println(tabuada+" X "+i+" = "+resultado);
        }
        
        
    }
}
