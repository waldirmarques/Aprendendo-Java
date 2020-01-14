import java.util.Scanner;

public class CalculoSimples{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float soma = 0;
		int quant = 0;
		float preco = 0;
		
		for(int i = 0 ; i < 2; i++) {
			
			String lista [] = input.nextLine().split(" ");
			
			quant = Integer.parseInt(lista[1]);
			preco = Float.parseFloat(lista[2]);
			soma += quant * preco;
		}

		System.out.printf("VALOR A PAGAR: R$ %.2f\n",soma);
		input.close();
		 
		
	}
}