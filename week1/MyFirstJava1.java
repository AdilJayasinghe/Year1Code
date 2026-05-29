import java.util.*;
public class MyFirstJava1
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please insert your name: ");
		String name = input.next();
		System.out.println("Hello " + name);
	}
}