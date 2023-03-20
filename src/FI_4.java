import java.util.Scanner;

public class FI_4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x;
		double y;

		System.out.println("Input x:");
		x = keyboard.nextDouble();
		System.out.println("Input y:");
		y = keyboard.nextDouble();
		
		if(x!=y) {
			System.out.println("1");
		}
		if(x>y) {
			System.out.println("2");
		}
		if(x%y == 0) {
			System.out.println("3");
		}
		
	}

}