package ISE
import java.util.*;
interface department
{
	void readdata();
	void printdata();
	void print_number_designations();
	void number_projs();
}

public class faculty
{
	String name;
	String des;
	int age;
	int yoe;
	String jdate;
	String subjects;
}

public class ise_deparment extends faculty implements department
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Faculty Members : ");
	n=sc.nextInt();
	faculty c[]=new faculty[n];
	void readdata()
	{
		System.out.println("Enter the Faculty's Name : ");
		name=sc.nextLine();
		System.out.println("Enter the Faculty's Designation : ");
		des=sc.nextInt();
		System.out.println("Enter the Faculty's Age : ");
		age=sc.nextInt();
		System.out.println("Enter the Faculty's Years of Experience : ");
		yoe=sc.nextInt();
		sc=nextLine();
		System.out.println("Enter the Faculty's Joining Date : ");
		jdate=sc.nextLine();
		System.out.println("Enter the Faculty's Subjects : ");
		subjects=sc.nextLine();
	}
	
	void printdata()
	{
		System.out.println("Faculty's Name : " + name);
		System.out.println("Faculty's Designation : " + des);
		System.out.println("Faculty's Age : "+age);
		System.out.println("Faculty's Years of Experience : "+yoe);
		System.out.println("Faculty's Joining Date : "+jdate);
		System.out.println("Faculty's Subjects : "+subjects);
	}
	
	
		
	
	

