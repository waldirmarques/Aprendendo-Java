import java.util.Scanner;

public class Exerc_01 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		int numero = Integer.parseInt(input.nextLine());
		
		int a = 0;
		int b = 1;
		int soma = 0;
		
		for(int i = 0;i<=numero-1;i++) { 
			System.out.println(soma);
			a = b;
			b = soma;
			soma = a+b;
		}
		input.close();
	}
}