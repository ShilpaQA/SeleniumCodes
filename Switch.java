import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args)
	{
		String i; 
		System.out.println("Enter your Choice of letter from a -e");
		 Scanner x=new Scanner(System.in);
		 i=x.next();
		 
		 switch(i)
		 {
			 case "a": System.out.println("Monday");
			 break;
			 case "b": System.out.println("Tuesday");
			 break;
			 case "c": System.out.println("Wednesday");
			 break;
			 case "d": System.out.println("Thursday");
			 break;
			 case  "e": System.out.println("Friday");
			 break;
			 
			default: System.out.println("Please enter a valid choice");
			 			 
		 }
		
	}

}
