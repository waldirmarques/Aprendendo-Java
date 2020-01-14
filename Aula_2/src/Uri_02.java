import java.util.Scanner;

public class Uri_02 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		double A = Double.parseDouble(entrada.nextLine());
		
		double B = Double.parseDouble(entrada.nextLine());
		
		double C = Double.parseDouble(entrada.nextLine());
		
		double MEDIA = ((A*2)+(B*3)+(C*5)) / (2+3+5);
		
		System.out.printf("MEDIA = %.1f\n",MEDIA);
		entrada.close();
	}
}
