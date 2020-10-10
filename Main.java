import java.util.Scanner;
package con.Employee;

public class Main{
	public static void main(String[]args){
				Scanner sc=new Scanner(System.in);

		Employee e = new Employee();
        e.name = "Saurabh";
        e.age = "25";
        e.display();
		
		
		Employee e1 = new Employee();
        e1.name = "Varsha";
        e1.age = "23";
        e1.display();
	}
}