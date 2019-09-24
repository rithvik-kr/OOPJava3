import java.util.Scanner;
import java.util.*;

class string 
{
	Scanner sc=new Scanner(System.in);
	void extract(String text)
	{
		
		System.out.println("Enter the Amount of Characters to be Extracted from the String : ");
		int m = sc.nextInt();
		System.out.println("Enter the Position of Extraction : ");
		int n=sc.nextInt();
		System.out.println(text.substring(n, n+m));
	}

	void occ(String text)
	{
		String[] tokens = text.split(" ");
		int wrc=1;

		for(int i=0;i<tokens.length;i++)
		{
			for(int j=i+1;j<tokens.length;j++)
			{
				if(tokens[i].equals(tokens[j]))
				{
					wrc=wrc+1;
					tokens[j]="0";
				}
			}
			if(tokens[i]!="0")
			System.out.println(tokens[i]+" : "+wrc);
			wrc=1;
		}
	}
		
	void replace(String text)
	{
		String txt;
		System.out.println("Enter the Word You Want to Replace : ");
		txt = sc.next();
		StringBuilder sb=new StringBuilder();
		String[] tokens = text.split(" ");
		
		System.out.println("Enter the Word to Replace With : ");
		String t=sc.next();
		for(int i=0;i<tokens.length;i++)
		{
			if(txt.equals(tokens[i]))
			{
				tokens[i]=t;
			}
			sb.append(tokens[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	
	void rearrange(String text)
	{
		String txt=text;
		for(int i = 1; i<txt.length; i++)
		{
			System.out.println(text.charAt(i));
		}
	}			
			



















	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		string s=new string();
		System.out.println("Enter the String : ");
		String text = sc.nextLine();
		System.out.println("The Entered String is : " + text);
		//s.extract(text);
		//s.occ(text);
		//s.replace(text);
		s.replace(text);
	}
}