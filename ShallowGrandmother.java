import java.util.Scanner;

public class ShallowGrandmother
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		double income, attractiveness;
		boolean allowed;

		System.out.println( "Enter your age: " );
		age = keyboard.nextInt();

		System.out.println( "Enter your yearly income: " );
		income = keyboard.nextDouble();

		System.out.println( "How attractive are you, on a scale of 0.0 to 10.0? ");
		attractiveness = keyboard.nextDouble();

		allowed = (age >25 && age < 40 && ( income > 50000 || attractiveness >=8.5 ));

		System.out.println( "You are allowed to date my grandchild: " + allowed );

	}
}
