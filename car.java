
public class car 
{
	public static void main(String[] args)
	{
		
		carA Audi = new carA();
		carB BMW = new carB();
		
		Audi.carspeed=100;
		Audi.ID= 1233; 
		BMW.carspeed=200;
		BMW.ID=1234;
		
		
		if (Audi.carspeed == BMW.carspeed)
		{
			System.out.println("The carspeeds are equal");
			System.out.println(Audi.ID);
			System.out.println(BMW.ID);
		}
		else
		{
			System.out.println("The carspeeds are different");
			System.out.println(Audi.ID);
			System.out.println(BMW.ID);
		}
		}
		
		
	}
	
	
	class carA
	{
		
		int carspeed;
		int ID;
		
		int methodspeed()
		{
			return carspeed;
		}
				
	}

	class carB{
		
		int carspeed;
		int ID;
		
		int speed()
		{
			return carspeed;
		}
		
		
		
	}
