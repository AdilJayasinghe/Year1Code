import java.util.*;

public class week2tutiii{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the mark ");
		int ICT = input.nextInt();
		
		System.out.print("Enter the mark ");
		int CW = input.nextInt();
	

		if (ICT<30 || CW<30)
		{
		
			System.out.print("One of your modules is less than 30; Fail");
		}
		else
		{
			int finalsum = (ICT + CW)/2;
			if (finalsum<40)
			{
				System.out.print("Your average is below 40; Fail");
			}
			else
			{
				System.out.print("You Passed");
			}
		}
	}
}