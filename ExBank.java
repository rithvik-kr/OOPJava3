import java.util.Scanner;

class Bank
{
	int accno;
	String name;
	Float balance;
	int phno;

	Scanner KB=new Scanner(System.in);
	
	void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno=KB.nextInt();
		System.out.print("Enter Name: ");
		name=KB.next();
		System.out.print("Enter the Phone No. : ");
		phno=KB.nextInt();
		System.out.print("Enter Balance: ");
		balance=KB.nextFloat();
	}

	void showAccount()
	{ 
		System.out.println(" Account No. : "+accno+"\n Name : "+name+"\n Phone No. : "+phno+"\n Balance : "+balance);
	}

	void deposit()
	{
		float amt;
		System.out.println("Enter Amount You Want to Deposit : ");
		amt=KB.nextFloat();
		balance=balance+amt;
	}

	void withdrawal()
	{
		float amt;
		System.out.println("Enter Amount You Want to withdraw : ");
		amt=KB.nextFloat();
		if(balance>=amt)
		{ 
			balance=balance-amt;
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}

	boolean search(int acn)
	{ 
		if(accno==acn)
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}

public class ExBank
{  
	public static void main(String arg[])
	{
		Scanner KB=new Scanner(System.in);
		
		//create initial accounts
		System.out.print("How Many Customers You Want to Input : ");
		int n=KB.nextInt();
		Bank  C[]=new Bank[n];
		for(int i=0;i<n;i++)
		{   
			C[i]=new Bank();
			C[i].openAccount();
		}
		
		int ch, acn;
		do
		{
			System.out.println("Main Menu\n 1.Display All\n 2.Deposit\n 3.Withdrawal\n 4.Exit");
			System.out.println("Your Choice :");
			ch=KB.nextInt();
			switch(ch)
			{ 
				case 1:
					for(int i=0;i<n;i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account No : ");
					acn=KB.nextInt();
					boolean found=false;
					for(int i=0;i<n;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acn=KB.nextInt();
					found=false;
					for(int i=0;i<n;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;
			}
		}
		while(ch!=4);
	}
}
