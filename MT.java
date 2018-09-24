import java.util.Scanner;
//Prathap program
public class MT {
	
	public static void main(String[] args)
	{
		
		int population;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the population of the city");
		population=x.nextInt();
		
		if(population<=100000)
		{
			System.out.println("T");
		}
		else 
		{
			System.out.println("M");
		}
		
		
	}

}
