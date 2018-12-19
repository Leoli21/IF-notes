import java.util.Scanner;

public class IFTest 
{

	public static void main(String[] args) 
	{
		int x = 5;
		int y = 7;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a integer: ");
		int firstNumber = in.nextInt();
		System.out.print("Please enter a double: ");
		double secondNumber = in.nextDouble();
		
		if(firstNumber > secondNumber)
		{
			System.out.println("First number is greater than second.");
		}
		else if(secondNumber > firstNumber)
		{
			System.out.println("Second number is greater than first.");
		}
		else
		{
			System.out.println("They are equal.");
		}

	}

}
