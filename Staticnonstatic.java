import java.util.Scanner;

public class Staticnonstatic {
	
	static int a; 
	static int b;
	
	public static void main(String[] args)
	{
		System.out.println("Enter values for a and b");
		Scanner input=new Scanner(System.in);
		a= input.nextInt();
		b=input.nextInt();
		System.out.println("Thank you!!");	
		int c = a+b; 
		System.out.println("Value of c is " + c);	
		//minus(); As these are not declared static we cannot use them here 
		//multiply();
		//Division();
		
		
	}
	
	 int minus() 
	 {
		 int d=a-b;
		 multiply();
		 System.out.println("Minus value is : " + d);
		 return d;
		 		 
	 }
	 
	 int multiply() 
	 {
		 int e=a*b;
		 System.out.println("Multiply value is : " + e);
		 return e;
		 		 
	 }
	 
	 int Division() 
	 {
		 int f=a*b;
		 System.out.println("Multiply value is : " + f);
		 return f;
		 		 
	 }


}
