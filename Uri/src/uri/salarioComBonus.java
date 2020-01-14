package uri;

import java.util.*;

public class salarioComBonus {

    public static void main(String[]args){
            Scanner input = new Scanner(System.in);

            int comissao = 15;

            System.out.println(" ");
            String nome = input.next();

            System.out.println(" ");
            double salario = input.nextDouble();

            System.out.println(" ");
            double vendas = input.nextDouble();
            
            double montanteVendas = salario + (vendas * comissao / 100);
            
            
            System.out.println("%.2f"+montanteVendas);
    }
}