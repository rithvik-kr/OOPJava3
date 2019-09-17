import java.util.Scanner;

class b
{ 
	int top,max; 
	int[] a; 
  
	b(int max) 
	{ 
        	top = -1; 
		this.a = new int[max];
        	this.max = max;
	} 
  
	void push(int x) 
	{ 
        	if (top >= (max - 1))
		{ 
        		System.out.println("Stack Overflow");  
        	} 
        	else
		{ 
        		a[++top] = x; 
        		System.out.println(x + " pushed into stack");  
        	}	 
	} 
  
	int pop() 
	{ 
        	if (top < 0)
		{ 
        		System.out.println("Stack Underflow"); 
        		return 0; 
        	} 
		else
		{ 
			int x = a[top--]; 
			return x; 
        	} 
	} 
  
	void display() 
	{ 
        	if (top < 0) 
		{ 
        		System.out.println("Stack is Empty");  
        	} 
		System.out.println("Contents of Stack are :");
        	for(int i=top;i>=0;i--)
		{
        		System.out.println(a[i]); 
		}
	} 
} 

public class stack
{ 
	public static void main(String args[]) 
	{ 
		System.out.println("Enter the Size of the Stack");
		Scanner sc=new Scanner(System.in);
		int max = sc.nextInt();
        	b s = new b(max); 
		int ch;
		do
		{
		System.out.println("Main Menu\n 1. Push\n 2. Pop\n 3. Display\n 4. Exit");
		System.out.println("Your Choice : ");
		ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the Element you want to Push : ");
					int item=sc.nextInt();
        				s.push(item);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.display();
					break;
					
			}
		} while(ch!=4);
	} 
} 






