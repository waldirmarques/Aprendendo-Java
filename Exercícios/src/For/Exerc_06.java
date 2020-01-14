/*
A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
Faça um programa capaz de gerar a série até o n−ésimo termo.
 */
package For;

public class Exerc_06 {
    public static void main(String[]args){
        
        long primeiroTermo = 1;
        long segundoTermo = 0;
        long proximoTermo = 0;
                
                
        for(int i = 1;i <= 500; ++i){
            proximoTermo = primeiroTermo+segundoTermo;
            System.out.println(proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            
        }
    }
}
