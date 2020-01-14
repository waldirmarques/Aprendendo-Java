//Sabendo que um funcionario ganha por mês 4000 rais, e que 15% desse valor é destinado
//ao inss e mais 4% são descontados devido pendencias com o seu patrão. Qual o valor
//real do seu sálario.

package Exercícios;

public class Exerc_03{
    public static void main(String[]args){
        double salario, desc_1, desc_2, salario_bruto;
        salario = 4000;
        desc_1 = 15;
        desc_2 = 4;
        salario = (salario - (salario * desc_1 / 100));
        salario_bruto = salario - (salario * desc_2 / 100);
        System.out.println("Sálario Bruto do funcionario = " + salario_bruto);
                
    }
}