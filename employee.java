import java.util.Scanner;

class emp
{
	String name;
	int id;
	double salary;
	int phno;
	Scanner sc=new Scanner(System.in);

	void getdata()
	{
		System.out.print("Enter Name : ");
		name=sc.nextLine();
		System.out.print("Enter Employee ID : ");
		id=sc.nextInt();
		System.out.print("Enter the Phone No. : ");
		phno=sc.nextInt();
	}
	
	void display()
	{
		System.out.println(" Name : "+name+"\n Employee ID : "+id+"\n Phone No. : "+phno+"\n Salary : "+salary);
	}
}

class ft extends emp
{
	void getdata()
	{	
		super.getdata();
		System.out.print("Enter the Full-Time Salary : ");
		salary=sc.nextDouble();
	}
}

class pt extends emp
{
	void getdata()
	{	
		super.getdata();
		System.out.print("Enter the Part-Time Salary : ");
		salary=sc.nextDouble();
	}
}

class employee
{
	public static void main(String arg[])
	{
		int i=0, k=0, ch;
		Scanner sc=new Scanner(System.in);
		ft obj[]=new ft[10];
		pt ob[]=new pt[10];
		do
		{
			System.out.println("Main Menu \n 1. Enter New Employee Details \n 2. Display Employee Details \n 3. Exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println(" 1. Full Time \n 2. Part Time");
					int n=sc.nextInt();
					switch(n)
					{
						case 1:
							obj[i]=new ft();
							obj[i].getdata();
							i++;
							break;
						case 2:
							ob[k]=new pt();
							ob[k].getdata();
							k++;
							break;
					}
					break;
				case 2:
					System.out.println("The List of Full-Time Employees : \n");
					for(int j=0;j<i;j++)
					{
						obj[j].display();
						System.out.println("\n");
					}
					System.out.println("\n\nThe List of Part-Time Employees : \n");
					for(int j=0;j<k;j++)
					{
						ob[j].display();
						System.out.println("\n");
					}
					break;
			}
		}	
		while(ch!=3);
	}
}
						













		
		