import java.util.*;
public class week3

{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mark : ");
		int num = input.nextInt();
		
		if(num>40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		if (num>75)
		{
			System.out.println("A");
		}
		else if (num>60)
		{
			System.out.println("B");
		}	
		else if (num>40)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
	}



}
