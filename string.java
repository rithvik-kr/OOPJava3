  
import java.util.Scanner;
import java.util.*;

class string
{
	Scanner sc=new Scanner(System.in);
	
	void extract(String text)
	{
		System.out.println("Enter the position : ");
		int n=sc.nextInt();
		System.out.println("Enter the Number of characters to be Extracted : ");
		int m=sc.nextInt();
		System.out.println(text.substring(n, n+m));
	}
	
	void occ(String text)
	{
		String[] token = text.split(" ");
		int n=1;
		
		for(int i=0; i<token.length; i++)
		{
			for(int j=i+1; j<token.length; j++)
			{
				if(token[i].equals(token[j]))
				{
					n=n+1;
					token[j]="0";
				}
			}
			if(token[i]!="0")
			{
				System.out.println(token[i]+" : "+n);
				n=1;
			}
		}
	}
	
	void rep(String text)
	{
		//String[] token = text.split(" ");
		System.out.println("Enter the Word you want to replace : ");
		String txt=sc.next();
		System.out.println("Enter the Word to Replace Wtih : ");
		String t=sc.next();
		System.out.println(text.replace(text.substring(2,4),t));
		/*StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<token.length; i++)
		{
			if(token[i].equals(txt))
				{
					token[i]=t;		
				}
			sb.append(token[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());*/
		
	}
	
	void rearrange(String text)
	{
		char[] temp = text.toCharArray();
		Arrays.sort(temp);
		//StringBuilder sb=new StringBuilder();
		//for(int i=0; i<temp.length; i++)
		//sb.append(temp[i]);
		String t=new String(temp);
		System.out.println("The Sorted String is : "+t);
		
	}
	
	void compare(String text)
	{
		System.out.println("Enter the Second String : ");
		String t = sc.nextLine();
		if(text.equalsIgnoreCase(t))
		{
			System.out.println("The Strings Are Equal : ");	
		}
		else
		System.out.println("The Strings are Not Equal : ");
	}

	void join(String text)
	{
		System.out.println("Enter the String to be Joined : ");
		String t = sc.nextLine();
		//StringBuilder sb=new StringBuilder();
		//sb.append(text).append(" ").append(t);
		System.out.println("The Concatenated String is : "+text.concat(t));
	}	



	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		string s=new string();
		System.out.println("Enter the String : ");
		String text = sc.nextLine();
		int ch;
		do
		{
			System.out.println("Main Menu\n 1. Extract\n 2. Occurrence\n 3. Replace\n 4. Rearrange\n 5. Compare\n 6. Concatenate\n 7. Exit\nYour Choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					s.extract(text);
					break;
				case 2:
					s.occ(text);
					break;
				case 3:
					s.rep(text);
					break;
				case 4:
					s.rearrange(text);
					break;
				case 5:
					s.compare(text);
					break;
				case 6:
					s.join(text);
					break;
			}			
		}
		while(ch!=7);
	}
}

			
					














