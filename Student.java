// non primitive datatype 
public class Student {
	
	Student s1 = new Student();
	
	public static void main(String[] args) 
	{ 
		System.out.println("Welcome");
		grades(21);
		
	}
	
	static void grades(int marks)
	{
		String G;
		if(marks>=80)
		{
			G="Grade A";
			System.out.println("Congrats !! Pass with A");
			System.out.println(G);
		}
		else if (marks>45 && marks<80)
		{
			G="Grade B";
			System.out.println("Can do better !! Pass with B");
			System.out.println(G);
		}
		else
		{
			G="Grade C";
			System.out.println("Sorry! Student has failed");
			System.out.println(G);
		}				
		
	}
			
}
