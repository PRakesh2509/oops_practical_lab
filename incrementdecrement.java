import java.util.Scanner;
public class incrementdecrement {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Value 1: "+a);

		int b=sc.nextInt();
		System.out.println("Value 2: "+b);
		
		int result1,result2;
		
		System.out.println("Value of a: " + a);
		result1 = ++a;
		System.out.println("After increment: " + result1);
		System.out.println("Value of b: " + b);
		result2 = --b;
		System.out.println("After decrement: " + result2);
	}
}
