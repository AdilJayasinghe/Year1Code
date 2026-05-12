import java.util.*;
public class weekivtut
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to find the factorial : ");
		int factor = input.nextInt();
		int answer=1;
		String answer2="";
		
		switch (factor)
		{
			case 0:
			System.out.print("Factorial of 0 is 1");
			break;
			
			default:
			for (int x=factor;x>=1;x--)
			{
				answer=answer*x;
				answer2=answer2+ "+" + x;
			}
			System.out.print("Factorial of " + factor + "=" + answer2 + "=" + answer);
			break;
		}
	}
}