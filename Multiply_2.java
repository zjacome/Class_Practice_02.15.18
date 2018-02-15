import java.util.Scanner;
public class Multiply_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		double a=sc.nextDouble();
		System.out.println("Enter the second number");
		double b=sc.nextDouble();
		
	
		double c=Product(a,b);
		
		System.out.println(c);
		

	}
	public static double Product(double a, double b) {
		double times=(a*b);
		
		return times;
		
		
	}

}
