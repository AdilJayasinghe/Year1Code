import java.util.*;
public class week3i

{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter GRADE : ");
		String grade = input.next();
		
		switch (grade)
		{
			case "A":
				System.out.println("Well Done. You Studied Well");
				break;
			case "B":
				System.out.println("Not Bad. You can do more);
				break;
			case "C":
				System.out.print1n("Study hard You Need improvement");
				break;
			case "S":
				System.out.println("You need to work harder");
				break;
			default:
				System.out.print1n("Invalid grade");
				break;
		}
	}
}