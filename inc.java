import java.io.InputStream;
import java.util.Scanner;  // gets created when we Scanner x=new Scanner (System.in);


public class inc {
	
	public static void main (String[] args) {
		
		Scanner x=new Scanner (System.in);
		
		int i=1;
		int j=i++;// i=2 , j=1 
		i++; // i=i+1 = 3
		int k=i; // 3
		i++; // 4
		int l=i; //=4
		
			
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);	
		System.out.println("Give a new value for i");
		i= x.nextInt();
		
		i++;
		
		System.out.println("Modified value of i =");
		System.out.println(i);
						
	}

			
}
	

