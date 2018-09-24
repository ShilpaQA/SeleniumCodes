
public class Arithmetic {

	//comments
	/* This section will have all the Arithmetic operator
	 * and also a program to
	 * add, subtract, multiply, divide, modulo, 
	 * ++ and -- 
	 */
	
	//method for addition
	
	static int addition(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	static double subtraction (double d, int e)
	{
		double f= d+e;
		System.out.println(f);
		return f;
		
	}
	
	static long mutiplication (int h, int i)
	{
		long g= h*i;
		System.out.println(g);
		return g;
		
	}
	
	static long division ()
	{
		int z= 10/3;
		System.out.println(z);
		return z;
	}
	
	static float modulo ()
	{
		float k= 11%3;
		System.out.println(k);
		return k;
	}
	
	static long increment ()
	{
		int n=99;
		n++;
		System.out.println(n);
		return n;
	}
	
	static int decrement (int m)
	{
		//int m=52;
		m--;
		//int l;
		//l+=45;
		System.out.println(m);
		return m;
		
	}
	
	/*static boolean istrue()
	{
		int p=200;
		int s=199;
		boolean abc;
		//abc ?: i>=j;
		//return abc;
		
	}*/
	
	public static void main(String[] args)
	{
		addition(90,45);
		subtraction(10.456,1123);
		mutiplication(100,2200);
		division();
		modulo ();
		increment ();
		decrement (23);
				
				
	}

}



