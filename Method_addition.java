//method to add two numbers along with non primitive datatype
public class Method_addition {
	
	public static int add(int i, int j)
	
	{
		int k=i+j;
		System.out.println(k);
		return k;
	}
	
	public static int sub()
	
	{
		int m=40;
		int n=100;
		int o=m-n;
		System.out.println(o);
		return o;
	}
	
	public static void main(String[] args) 
	{
			System.out.println("Addition of two numbers");
			//add(10,20)+; How to use the value of sub ?? 
			add(10,20);
			System.out.println(sub());			
			nonprimitive();
	}
	
		public static Method_addition nonprimitive()
	{
		Method_addition m = new Method_addition();
		System.out.println(m);
		return m;
	}
}
	
