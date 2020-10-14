
import java.util.*;
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		Avenger [] avenger = new Avenger[5];
		//create object
		for(int i=0;i<4;i++)
		{
			 avenger[i]=new Avenger();  		
		}
		
		
		//print get details
		
		for(int i=0; i<4;i++) 
		{
			avenger[i].getDetails();
			avenger[i].displayDetails();

		}		

	}
}