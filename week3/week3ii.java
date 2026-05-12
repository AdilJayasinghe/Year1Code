import java.util.*;
public class week3ii
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.printf("Enter the number : ");
		num=intput.nextInt();
		int result = num%2;
		
		switch(result)
		{
			case 0:
			System.out.println("Even Number");
			break;
			
			case1:
			System.out.println("Odd Number");
			break;
			
			default:
			System.out.println("Invalid");
			break;
		}
	}
}