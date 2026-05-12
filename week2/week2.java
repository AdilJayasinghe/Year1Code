import java.util.*;
public class week2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String name = input.next();
		System.out.println("Enter your last name : ");
		String lname = input.next();
		System.out.println("Hello! "+ name + " " + lname + "! Welcome to the world of Java");
	}
}