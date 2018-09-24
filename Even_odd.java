import java.util.Scanner;
public class Even_odd {
	
	// to find if a number is odd or even 
	
		public static void main(String[] args)
		{
			int i;
			Scanner x= new Scanner(System.in);
			System.out.println("Enter the text under test");
			i=x.nextInt();
			
			
			
			//if(i==0)
			//{
			//	System.out.println("Number is even");
			//}
			
			if(i%2==0)
			{
				System.out.println("Number is even");
			}
			
			else
			{
				System.out.println("Number is odd");
			}
			
			
			
		}

}
 