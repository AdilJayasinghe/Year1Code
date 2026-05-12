import java.util.*;

public class week2tutiv{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the mark ");
		int mark = input.nextInt();
		
		if (mark>100)
		{
			System.out.print("Invalid");
		}
		
		else if (mark>=70)
		{
			System.out.print("1st Class Honours (1)");
		}
		
		else if (mark>=60)
		{
			System.out.print("2nd Class Honours Upper Division(2-i)");
		}
		
		else if (mark>=50)
		{
			System.out.print("3rd Class Honours Lower Division (2-ii)");
		}
		else if (mark>=40)
		{
			System.out.print("3rd Class Honours (3)");
		}
		else
		{
			System.out.print("Fail");
		}
	}
}