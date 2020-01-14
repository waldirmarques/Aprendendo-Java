import java.util.Scanner;

public class Uri_06 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		int numero = input.nextInt();
		
		int A = 0;
		int B = 1;
		int aux = 0;

		for(int i = 0; i<numero; i++ ) {			
			System.out.println(aux);
			A = B;
			B = aux;
			aux = A+B;						
		}
		input.close();
	}
}
