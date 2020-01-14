import java.util.Scanner;

public class Exerc_05 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Digite numero: ");		
		
		int numero = Integer.parseInt(entrada.nextLine());		
		
		for(int i = numero; i <= 100; i+=numero) {
			System.out.println(i);
		
		}entrada.close();
	}

}

