import java.util.Scanner;

public class fibonaceRecursão {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int posi = Integer.parseInt(input.nextLine());
		
		System.out.println(fib(posi));
		
		input.close();
				
	}
	public static int fib(int pos) {
		if(pos==0) {
			return 0;
		}else if(pos==1) {
			return 1;
		}else {
			return fib(pos-1)+fib(pos-2);
		}
	}
}
