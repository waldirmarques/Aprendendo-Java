/* Peça do usuario as três notas de um aluno e depois
mostre a sua media final.
*/
package Exercícios;

import java.util.*;

public class Exerc_04{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3;
        double media;
        
        System.out.println("Digite a primeira nota do aluno; ");
        nota1 = input.nextDouble();
        System.out.println("Digite segunda nota do aluno; ");
        nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota do aluno; ");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3)/3;
        
        System.out.println("Media do aluno; "+media+" pontos");
                
    }
}