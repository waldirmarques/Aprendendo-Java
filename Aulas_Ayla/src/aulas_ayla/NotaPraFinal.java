package aulas_ayla;

public class NotaPraFinal {
    public static void main(String []agrs){
        System.out.println("Bem vindo(a) à Calculadora de médias");
        
        double nota1 = 9.0;
        double nota2 = 5.8;
        double nota3 = 6.3;
        
        double media = (nota1+nota2+nota3)/3;
        
        if (media >= 4 && media < 7){
            double notaPraPassar = (5 - 0.6*media) / 0.4;
            System.out.println("Você presisa de"+notaPraPassar);
        }
        
    }
    
}
