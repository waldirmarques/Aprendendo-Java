import java.util.Scanner;

public class Exerc_06 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite inteiro n; ");
		
		int numero = Integer.parseInt(entrada.nextLine());
		double soma = 0;
		
		for(int i = 0; i < numero; i++) {
			System.out.println("Informe nota: ");
			double nota = Double.parseDouble(entrada.nextLine());
			soma+=nota;
		}
		double media = soma / numero;		
		System.out.printf("Media do aluno = %.1f",media);
		entrada.close();
	}	
}

