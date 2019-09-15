import java.util.Scanner;

class bank
{
	int accno;
	String name;
	Float balance;
	int phno;

	Scanner KB=new Scanner(System.in);
	
	//method to open an account
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

	//method to display account details
	void showAccount()
	{ 
		System.out.println(" Account No. : "+accno+"\n Name : "+name+"\n Phone No. : "+phno+"\n Balance : "+balance);
	}

	//method to deposit money
	void deposit()
	{
		float amt;
		System.out.println("Enter Amount You Want to Deposit : ");
		amt=KB.nextFloat();
		balance=balance+amt;
	}

	//method to withdraw money
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

	//method to search an account number
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

public class Bank
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
		
		//run loop until menu 5 is not pressed
		int ch;
		do
		{
			System.out.println("Main Menu\n 1.Display All\n 2.Search By Account\n 3.Deposit\n 4.Withdrawal\n 5.Exit");
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
					System.out.print("Enter Account No You Want to Search...: ");
					int acn=KB.nextInt();
					boolean found=false;
					for(int i=0;i<n;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
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
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 4:
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
		while(ch!=5);
	}
}
