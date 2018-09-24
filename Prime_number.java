import java.util.Scanner;

public class Prime_number {
	
	public static void main(String[] args) {
		
		int i;
		
		Scanner x= new Scanner(System.in);
		System.out.println(" Enter the number for test");
		i=x.nextInt();
		
		//PROGRAM LOGIC 		
		if(i==0 || i==1 || i==2 || i==3)
		{
			System.out.println(" The number is a prime number");
		}
		else if (i%2==0 || i%3==0) 
		{
			System.out.println(" The number is a not prime number");
		}
		else
		{
			i++;
			
			if(i/2==0)
			{
				System.out.println(" The number is a not prime number");
			}
			else 
			{
				System.out.println(" The number is a prime number");
			}	
			
		}				
		
	}

}
