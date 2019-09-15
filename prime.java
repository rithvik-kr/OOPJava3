import java.util.Scanner;

class prime
{
	public static void main(String arg[])
	{
		int prime, flag=0;
		System.out.println("Enter the number : ");
		Scanner obj=new Scanner(System.in);
		prime=obj.nextInt();
		if(prime==0 || prime==1)
		System.out.println("The Entered Number is not a Prime Number.");
		else
		{
			for(int i=2;i<=(prime/2);i++)
			{
				if(prime%i==0)
				{
					System.out.println("The Entered Number is not a Prime Number.");
					System.out.println("It is divisble by : "+i);
					flag = 1;
					break;
				}
			}
			if(flag==0)
			System.out.println("The Entered Number is a Prime Number.");
		}
	}
}