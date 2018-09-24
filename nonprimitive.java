//non primitive datatype method creation 

public class nonprimitive {
	
	
	// non primitive type method 
	public static nonprimitive abc()
	{
		nonprimitive n=new nonprimitive();
		System.out.println(n);
		return(n);
	}
	
	public static void main(String[] args)
	{
		abc(); // calling the non primitive type method 
		System.out.println("Here I print nonprimitive");
		abc(); // calling the non primitive type method 
	}

}
