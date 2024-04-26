import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float temperature;
      Scanner in =new  Scanner(System.in);
      System.out.println("Enter temerature of coffe");
      temperature=in.nextInt();
      
	temperature=((	temperature-32)*4)/7;
      System.out.println("temperature of coffie:"+temperature);
	}

}
