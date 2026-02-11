package intro;

import java.util.*;
public class Arithmetic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two number one beside the other: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Choose below option to perform specific operation");
		System.out.println("Option 1 is Additon");
		System.out.println("Option 2 is Subtraction");
		System.out.println("Option 3 is division");
		System.out.println("Option 4 is multiplication");
		int option = scan.nextInt();
		if(option == 1)
		{
			int c = a+b;
			System.out.println("Addditon of entered numbers "+c);
		}
		else if(option == 2)
		{
			int c = a-b;
			System.out.println("Subtraction of entered numbers "+c);
		}
		
		else if(option == 3)
		{
			int c = a/b;
			System.out.println("division of entered numbers "+c);
		}
		else
		{
			int c = a*b;
			System.out.println("multiplication of entered numbers "+c);

		}
		
	
	}
	

}
