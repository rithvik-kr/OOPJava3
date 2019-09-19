import java.util.Scanner;

class cmplx
{
	double real,img;
	Scanner sc = new Scanner(System.in);
	cmplx()
	{
		real=0;
		img=0;
	}

	cmplx input()
	{
		cmplx temp = new cmplx();
		System.out.println("Enter the Real Part : ");
		temp.real = sc.nextDouble();
		System.out.println("Enter the Imaginary Part : ");
		temp.img = sc.nextDouble();
		return temp;
	}
	
	cmplx sum(cmplx c1, cmplx c2)
	{
		cmplx temp = new cmplx();
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}

	cmplx sub(cmplx c1, cmplx c2)
	{
		cmplx temp = new cmplx();
		temp.real = c1.real - c2.real;
		temp.img = c1.img - c2.img;
		return temp;
	}

	cmplx mul(cmplx c1, cmplx c2)
	{
		cmplx temp = new cmplx();
		temp.real = (c1.real*c2.real)-(c1.img*c2.img);
		temp.img = (c1.img*c2.real)+(c2.img*c1.real);
		return temp;
	}
}

class complex
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int ch;
		cmplx temp = new cmplx();
		cmplx c2 = new cmplx();
		cmplx c1 = new cmplx();
		do
		{
			System.out.println("Main Menu\n 1. Enter the First Complex Number\n 2. Enter the Second Complex Number\n 3. Display All\n 4. Add\n 5. Subtract\n 6. Multiply\n 7. Exit");
			System.out.println("Your Choice :");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					c1=c1.input();
					break;
				case 2:		
					c2=c2.input();
					break;
				case 3:
					System.out.println("Complex Number 1 : "+c1.real + " + " + c1.img+"i");
					System.out.println("Complex Number 2 : "+c2.real + " + " + c2.img+"i");
					break;
				case 4:
					temp=temp.sum(c1,c2);
					System.out.println("The Sum is : "+temp.real + " + " + temp.img+"i");
					break;
				case 5:
					temp=temp.sub(c1,c2);
					System.out.println("The Difference is : "+temp.real + " + " + temp.img+"i");
					break;
				case 6:
					temp=temp.mul(c1,c2);
					System.out.println("The Product is : "+temp.real + " + " + temp.img+"i");
					break;
			}
		}
		while(ch!=7);
	}
}





















