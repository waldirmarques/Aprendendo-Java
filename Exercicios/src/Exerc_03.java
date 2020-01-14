import java.util.Scanner;

public class Exerc_03 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		String entrada [] = input.nextLine().split(" ");
		
		double A = Double.parseDouble(entrada[0]);
		double B = Double.parseDouble(entrada[1]);
		double C = Double.parseDouble(entrada[2]);
		
		double AreaDoTrinanguloRetangulo = (A * C)/2;
		double AreaDoCirculo = 3.14159 * (C*C);
		double AreaDoTrapezio = ((A+B)*C)/2;
		double AreaDoQuadrado = B*B;
		double AreaDoRetangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n",AreaDoTrinanguloRetangulo);
		System.out.printf("CIRCULO: %.3f\n",AreaDoCirculo);
		System.out.printf("TRAPEZIO: %.3f\n",AreaDoTrapezio);
		System.out.printf("QUADRADO: %.3f\n",AreaDoQuadrado);
		System.out.printf("RETANGULO: %.3f\n",AreaDoRetangulo);
		
		input.close();
	}
}

