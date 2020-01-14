import java.util.Scanner;

public class Exerc_06 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		String linha1 [] = input.nextLine().split(" ");
		String linha2 [] = input.nextLine().split(" ");
		
		double x1 = Double.parseDouble(linha1[0]);
		double y1 = Double.parseDouble(linha1[1]);
		
		double x2 = Double.parseDouble(linha2[0]);
		double y2 = Double.parseDouble(linha2[1]);
		
		double resX = Math.pow (x2 - x1,2);
		double resY = Math.pow (y2 - y1,2);
		
		double distancia = Math.sqrt(resX + resY);
		
		System.out.printf("%.4f\n",distancia);
		
		input.close();
		
	}
}
