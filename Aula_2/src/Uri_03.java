import java.util.Scanner;

public class Uri_03 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		String nome = input.next();
		
		double salario = input.nextDouble();
		
		double TotalVendasMes = input.nextDouble();
		
		int comissao = 15;
		
		double valorSalario = salario + (TotalVendasMes * comissao / 100);
		
		System.out.printf("Total = R$ %.2f",valorSalario);
		input.close();
	}
}
