

	import java.util.Scanner;
	
	
	class  ArithmaticOperator
	{
	public static void main(String args[])
	{
	int  x, y, z;
	System.out.println("Enter two integers to calculate their sum ");
	Scanner in = new Scanner(System.in);
	x = in.nextInt();
	y = in.nextInt();
	z=x+y;
	System.out.println("Addition of entered integers x+y:"+z);
	z=x-y;
	System.out.println("substraction of entered integers x-y:"+z);
	z=x*y;
	System.out.println("Multiplication of entered integers x*y:"+z);
	z=x/y;
	System.out.println("Divison of entered integers x/y:"+z);
	z=x%y;
	System.out.println("Divison of entered integers x%y:"+z);
	}
	}

	
	

