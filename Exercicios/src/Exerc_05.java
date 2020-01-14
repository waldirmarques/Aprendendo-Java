import java.util.Scanner;

public class Exerc_05 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int distancia = Integer.parseInt(input.nextLine());
		double kilometro = Float.parseFloat(input.nextLine());
		
		double gasto = distancia / kilometro;
		
		System.out.printf("%.3f km/l\n",gasto);
		input.close();
	}
}
