import java.util.Scanner;
import java.lang.Math.*;

class circle
{
	Scanner sc=new Scanner(System.in);
	double area, rad;
	
	circle()
	{
		System.out.println("Enter the Radius of the Circle : ");
		rad=sc.nextDouble();
	}
	
	double area()
	{
		area=3.142*rad*rad;
		return area;
	}
}

class sector extends circle
{
	double ang;
	
	sector()
	{
		System.out.println("Enter the Angle in Radians : ");
		ang=sc.nextDouble();
	}

	double area()
	{
		area=0.5*rad*rad*ang;
		return area;
	}
}

class segment extends sector
{
	double length;
	
	segment()
	{
		System.out.println("Enter the Length of Segment : ");
		length=sc.nextDouble();
	}

	double area()
	{
		area=((ang-Math.sin(ang))/2)*rad*rad;
		return area;
	}
}

class q8
{
	public static void main(String arg[])
	{
		circle a=new circle();
		a.area();
		System.out.println("The Area of Circle is : "+a.area);
		sector b=new sector();
		b.area();
		System.out.println("The Area of Sector is : "+b.area);
		segment c=new segment();
		c.area();
		System.out.println("The Area of Segment is : "+c.area);
	}
} 
