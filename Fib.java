
public class Fib
{	
	public static void main(String[] args)
	{
		
		int n1 =0;
		int n2= 1;
		int n3=0;
		
		for (int n=1; n<=10;n++) 
		{
			 
			n3 = n1+n2; //1,2,3
			n1=n2;//1,1
			n2=n3;//1,2
		 
			System.out.println(n3);
		}
	}
}