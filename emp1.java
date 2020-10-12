/*Take employee name,date of birth,month of birth
birth year, monthly salary;
5l - 20%;
4l - 15%;
3l- 10%;
2l -5%;
Display name,age,annual salary and the tax amount */

import java.util.Scanner;

public class emp1{
	public static void main(String[]args){
		String name;
		int DOB;
		int DOM;
		int DOY;
		double salary;
		double tax=0,incometax;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		name=sc.next();
		
		System.out.println("enter BITH DATE");
		DOB=sc.nextInt();
	
		System.out.println("enter BIRTH MONTH");
		DOM=sc.nextInt();
		
		System.out.println("enter BIRTH YEAR");
		DOY=sc.nextInt();
		
		System.out.println("enter monthly Salary amount");
		salary=sc.nextDouble();
		
	
	tax=incomeTax(salary*12);
	
	    System.out.println("Employee name :" +name);
		System.out.println("Date Of Birth is :"+ DOB +"-" + DOM + "-" + DOY);
		System.out.println("Employee anuual Salary is :"+salary * 12);
	    System.out.println("Income tax amount is "+tax);
	}
static double incomeTax(double i)
{
	double tax;	
	if(i<=200000)
		tax=0;
	else if(i<=300000)
		tax=0.5*(i-200000);
	else if(i<=500000)
		tax=(1.0*(i-300000))+10000;
	else if(i<=1000000)
		tax=(1.5*(i-500000))+50000;
	else
		tax=(2.0*(i-1000000))+200000;
	return tax;
		
		
		
	}
	
	
}
