import java.util.Scanner;

class Bubble_Sort_Descending 
{
	public static void main(String arg[])
	{
		int n, i;
		System.out.print("Enter the Number of Elements : ");
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements to be Sorted : ");
		for (i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
	
		for (i=0;i<n-1;i++)
		for(int j=0;j<n-i-1;j++)
		if(a[j]<a[j+1])
		{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
		System.out.println("The Sorted Elements in Ascending Order : ");
		for (i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
	