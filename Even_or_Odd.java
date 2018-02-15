import java.util.Scanner;
public class Even_or_Odd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	double num=sc.nextDouble();
	String x=EvenOdd(num);
	System.out.print(x);
	
	}
	public static String EvenOdd(double num) {
	String T="true";
	String F="false";	
		if(num%2==0) {
		
		
		return T;
	}
	else{
		
		
		return F;
	}
		
}
	}
