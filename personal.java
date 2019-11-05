import java.util.*;
class personal
{
	String name, edu;
	int age, nol, yoe;
	double sal;
	double[] loan = new double[3];
	Scanner sc=new Scanner(System.in);
	
	personal()
	{
		System.out.println("Enter the Name : ");
		name=sc.nextLine();
		System.out.println("Enter the Age : ");
		age=sc.nextInt();
		System.out.println("Enter the Education : ");
		edu=sc.next();
		System.out.println("Enter the Salary : ");
		sal=sc.nextDouble();
		System.out.println("Enter the Experience : ");
		yoe=sc.nextInt();
		System.out.println("Enter the Number of Loans : ");
		nol=sc.nextInt();
		for(int i=0;i<nol;i++)
		{
			System.out.println("Enter the Loan Amount : ");
			loan[i]=sc.nextDouble();
		}
	}

	void isEligible(int x)
	{
		if(x>3)
		{
			System.out.println("Not Eligible for Loan");
		}
		else
			System.out.println("Eligible for Loan");
	}
	
	void taxPay(double x)
	{
		if(x<250000)
			System.out.println("No Tax to be Paid");
		else if(x>=250000 && x<=100000)
			System.out.println("Tax to be Paid : " + (x*0.3));
		else
			System.out.println("Tax to be Paid : " + (x*0.4));
	}
	
	void promotion(int x)
	{
		if(x<10)
			System.out.println("Not Eligible for Promotion");
		else
			System.out.println("Eligible for Promotion");
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Education : "+edu);
		System.out.println("Salary : "+sal);
		System.out.println("Years Of Experience : "+yoe);
		System.out.println("Number of Loans : "+nol);
		for(int i=0;i<nol;i++)
		{
			System.out.println("Loan Amount : "+loan[i]);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Number of Employees : ");
		n=sc.nextInt();
		personal per[]=new personal[n];
		for(int i=0;i<n;i++)
		{
			per[i]=new personal();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\n\n")
			per[i].display();
			per[i].isEligible(per[i].nol);
			per[i].taxPay(per[i].sal);
			per[i].promotion(per[i].yoe);
		}
		
	}
}	
		
		 
