import java.util.*;
public class week3iiitut
{
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num=input.nextInt();
		
		System.out.print("Enter a letter : ");
		String letter=input.next();
	
		for(int i=1;i<=num;i++){
			System.out.print(letter);
		}
	}
}