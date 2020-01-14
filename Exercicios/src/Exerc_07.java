import java.util.Scanner;

public class Exerc_07 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int entrada = Integer.parseInt(input.nextLine());
		
		int resposta = entrada*2;
		
		System.out.printf("%d minutos\n",resposta);
		
		input.close();
	}
}