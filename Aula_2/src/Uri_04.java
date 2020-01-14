import java.util.Scanner;

public class Uri_04 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int quantidade = input.nextInt();
		int cont = 0;
		
		while(cont < quantidade) {
			
			long numero = input.nextLong();			
			
			if(numero > 0) {
				if(numero % 2 == 0) {
					System.out.println("EVEN POSITIVE");
				}else {
					System.out.println("ODD POSITIVE");
				}			
			
			}else if(numero < 0 ){
				if(numero % 2 == 0) {
					System.out.println("EVEN NEGATIVE");
				}else {
					System.out.println("ODD NEGATIVE");
				}			
			
			}else {
				System.out.println("NULL");
			}
			cont++;
		}			
		input.close();
	}
}
