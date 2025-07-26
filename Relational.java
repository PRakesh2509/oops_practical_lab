import java.util.Scanner;
public class Relational {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Value 1: "+a);

		int b=sc.nextInt();
		System.out.println("Value 2: "+b);
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}	
}
