import java.util.*;
public class week3iii
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number1 : ");
		int num1 = input.nextInt();
		
		System.out.printf("Enter the number2 : ");
		int num2 = input.nextInt();
		
		System.out.printf("Enter the operator : ");
		char operation = input.next().charAt(0);
		
		switch(operation)
		{
			case '-':
			System.out.println(num1-num2);
			break;
			
			case '+':
			System.out.println(num1+num2);
			break;
			
			case '/':
			System.out.println(num1/num2);
			break;
			
			case '*':
			System.out.println(num1*num2);
			break;
			
			default:
			System.out.println("Invalid Operator");
			break;
		}
	}
}