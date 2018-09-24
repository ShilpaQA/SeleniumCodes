import java.util.Scanner;

public class inc1 {
	public static void main (String[] args) 
	
	{
		
		int b;
		int c;
		Scanner x=new Scanner (System.in);
		System.out.println("Please enter value for b");
		b=x.nextInt();
		System.out.println("Please enter value for c");
		c=x.nextInt();
		incr(b);
		decr(b,c);
						
		//System.out.println(u);	
		//System.out.println(v);
		
	}
	
	static int incr(int i)
	{
			
		int m= i++ - ++i - ++i + i++ + i++  - i--;
		System.out.println("The first method results");
		System.out.println(i);
		System.out.println(m);
		return i;
			
	}
	
	static int decr (int i, int j)
	{
			
		int k= i-- + --i + --i + i++ + i++  - i--;
		int l= j++ + j-- + --j + j++;
		System.out.println("The second method results");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		return i;
			
	}
}
