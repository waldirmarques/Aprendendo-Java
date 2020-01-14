import java.util.Scanner;

public class Exerc_02 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double raio = Float.parseFloat(input.nextLine());		
		double volume = (4/3.0) * pi * (raio*raio*raio);
		
		System.out.printf("VOLUME = %.3f\n",volume);
		
		input.close();
	}
}
