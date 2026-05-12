import java.util.*;
public class week3vtut
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a nth factor");
		int num=input.nextInt();
		
		switch(num){
			
			case(1):
			System.out.println(0);
			break;
			
			case(2):
			System.out.println(1);
			break;
			
			default:
			
			int first=0;
			int second=1;
			int next=0;

			System.out.print(1+","+1);
			for(int i=3;i<=num;i++)
			{
				next=first+second;
				System.out.print(","+next);
				first=second;
				second=next;
				
			}
			break;
		}
	}
}