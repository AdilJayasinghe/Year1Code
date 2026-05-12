import java.util.*;
public class week4tutii
{
	public static void main(String [] args)
	{
		String[] array={"Alex","Max","Charlie","Bob","Ada","Jim"};
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first index");
		int num1=input.nextInt();
		
		System.out.print("Enter second index to swap");
		int num2=input.nextInt();
		
		String temp=array[num1];
		array[num1]=array[num2];
		array[num2]=temp;
	}
}