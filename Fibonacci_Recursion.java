import java.util.Scanner;

class Fibonacci_Recursion
{  
	static int n1=0,n2=1,n3=0;    
	static void Fibonacci(int count)
	{    
		if(count>0)
		{    
        		n3 = n1 + n2;    
        		n1 = n2;    
        		n2 = n3;    
        		System.out.print(" "+n3);   
        		Fibonacci(count-1);    
     		}    
	}
	public static void main(String arg[])
	{
		int count;
		System.out.println("Enter the Count Number : ");
		Scanner sc = new Scanner(System.in);
		count=sc.nextInt(); 
		System.out.print(n1+" "+n2);
		Fibonacci(count-2);
	}
}	