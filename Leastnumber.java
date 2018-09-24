import java.util.Scanner;
public class Leastnumber {
		public static void main (String[] args)
	{		
		// program to find cities with least population 
		int LA;
		int SFO;
		int SanDiego;			
		Scanner a= new Scanner(System.in);
		System.out.println("Please enter the cities for comparision");
		System.out.println("City1 : LA");
		LA= a.nextInt();
		System.out.println("City1 : SFO");
		SFO =a.nextInt();
		System.out.println("City1 : Diego");
		SanDiego =a.nextInt();
		if(LA<SFO && LA <SanDiego)
		{
			System.out.println("LA has least population");
		}
		else if ( SFO>LA && SFO< SanDiego)
		{
			System.out.println("SFO has least population");
		}
		else if (SFO==LA && SFO==SanDiego && LA==SanDiego)
		{
			System.out.println("All cities have same population");
		}
		else if (SFO==LA || SFO==SanDiego)
		{
			System.out.println("SFO and LA have same population");
		}
		else if (LA==SanDiego)
		{
			System.out.println("LA and SanDeigo have same population");
		}
		else
		{
			System.out.println("SanDiego has least  population");
		}
		System.out.println("Thank you for using this JAVA program");		
	}
} 
