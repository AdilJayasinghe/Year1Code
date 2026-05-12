import java.util.*;
public class week2tutv
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
		
		if (operation=='-')
		{
			System.out.println(num1-num2);
		}
			
		else if (operation=='+')
		{
			System.out.println(num1+num2);
		}
			
		else if (operation=='/')
		{
			System.out.println(num1/num2);
		}
			
		else if (operation=='*')
		{
			System.out.println(num1*num2);
		}
			
		else
		{
			System.out.println("Invalid Operator");
		}
	}
}