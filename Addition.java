// welcome to Deepsika coding videos

// How to add two number program in java ?



import java.util.Scanner;

public class Addition {

	public static void main (String [] args)
{
		int x, y,z;
		System.out.println("Enter two integer");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x+y;
		System.out.println("Sum of entered integer :"+z);
}
}
