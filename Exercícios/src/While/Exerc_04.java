/* O Ministério da Saúde deseja vacinar contra o sarampo todas as crianças
de 3 a 6 anos. Escreva um programa para ser usado em uma escola que receba como
entrada a idade de várias crianças até que o usuário não deseje mais informar
dados, e calcule e exiba a quantidade total de vacinas aplicadas. 
*/

package While;

import java.util.*;

public class Exerc_04{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        boolean i = true;
        int vacinasNecessarias = 0;
        
        while(i){
            System.out.println("Informe á idade da criança; ");
            int idade = input.nextInt();
            
            if (idade >= 3 && idade <= 6){
                vacinasNecessarias += 1;
            }
            
            System.out.println("Caso deseje continuar digite 0 ou outro valor para parar; ");
            int opcao = input.nextInt();
            
            if (opcao == 0){
                i = false;
            }
        }
        System.out.println("Quantidade de vacinas necessarias; "+vacinasNecessarias);
    }
}