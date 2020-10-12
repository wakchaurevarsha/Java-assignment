import java.util.Scanner;

public class sub{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, biology, physics, maths; 
	    float total, Percentage, Average;
		sc = new Scanner(System.in);
	
	    System.out.println("english");
		english = sc.nextInt();	
		
		System.out.println("chemistry");
		chemistry = sc.nextInt();
		
        System.out.println("biology");		
		biology = sc.nextInt();	
		
		System.out.println("physics");
		physics = sc.nextInt();	
		
		System.out.println("maths");
		maths = sc.nextInt();	
		
		
		total = english + chemistry + biology + physics + maths;
		Average = total / 5;
	    Percentage = (total / 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
	}
}
