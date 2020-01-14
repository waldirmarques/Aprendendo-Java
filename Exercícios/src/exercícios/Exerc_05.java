package exercícios;

import java.util.*;

public class Exerc_05{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual valor do sálario por hora trabalhada; ");
        double salarioHora = input.nextDouble();
        System.out.println("Qual o número de horas trabalhadas no mês; ");
        int horasTrabalhadas = input.nextInt();
        System.out.println("Qual o percentual de desconto  do INSS; ");
        int descontoInss = input.nextInt();
        
        double salarioSemDesconto = salarioHora * horasTrabalhadas;
        double salarioComDesconto = salarioSemDesconto * descontoInss / 100;
        double salarioBruto = salarioSemDesconto - salarioComDesconto;
        
        System.out.println("O sálario bruto do funcionario é de; "+salarioBruto);
    }
}