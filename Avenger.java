import java.util.*;
import java.util.Scanner;

public class Avenger{
	
	Scanner sc = new Scanner(System.in);

	
	public String name;
	public int age;
	public float power; 
	public String weapon;
	public String planet;
	
	public void  getDetails(){
		
		System.out.println("enter the name");
		name=sc.nextLine();
		System.out.println("enter the age");
		age=sc.nextInt();
		System.out.println("enter the Power");
		power=sc.nextFloat();
		System.out.println("enter the weapon");
		weapon=sc.next();
		System.out.println("enter the Planet");
		planet=sc.next();
		
	}	
	
	public void  displayDetails(){
		
		System.out.println("the name "+name + " age is " +age + " power is " +power+ " weapon is " +weapon +" planet is " +planet);

	}	
}