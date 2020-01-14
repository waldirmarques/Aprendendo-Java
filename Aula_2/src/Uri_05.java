import java.util.Scanner;

public class Uri_05 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		boolean condicao = true;
		
		while(condicao) {
			
			int entrada = Integer.parseInt(input.nextLine());
			
			if(entrada == 1) {
				alcool += 1;
			
			}else if(entrada == 2) {
				gasolina += 1;
			
			}else if(entrada == 3) {
				diesel += 1;
			
			}if(entrada < 1 && entrada > 4) {
				
				entrada = 0;
			
			}else if(entrada == 4) {
				System.out.println("MUITO OBRIGADO");
				condicao = false;
			}		
			
		}
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		input.close();
	}
}
