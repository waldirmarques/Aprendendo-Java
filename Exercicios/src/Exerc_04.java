import java.util.Scanner;

public class Exerc_04 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		String entrada[] = input.nextLine().split(" ");
		
		int a = Integer.parseInt(entrada[0]);
		int b = Integer.parseInt(entrada[1]);
		int c = Integer.parseInt(entrada[2]);
		
		int maiorAB = (a + b +  Math.abs(a - b)) / 2;		
		
		int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
		System.out.printf(maiorABC + " eh o maior\n");
		
		input.close();	
		
	}

}
