import java.util.Scanner;

public class Uri_07 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int div = 0;

		int entrada = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i <=entrada; i++) {
		
			int numero = Integer.parseInt(input.nextLine());
			
			for(int k = 1;k<=numero+1;k++) {
				if(numero % k == 0) {
					div += 1;
				}
			}
			if(div == 2) {
				System.out.printf("%d eh primo",numero);
			}else {
				System.out.printf("%d nao eh primo",numero);
			}
			div = 0;
		}
		input.close();
	}
}
