import java.util.*;
public class week4tuti
{
	
	public static void main(String [] args)
	{
		int[] marks = new int[6];
		Scanner input = new Scanner(System.in);
		for (int i=0;i<=5;i++){			
			System.out.println("Enter a mark: ");
			marks[i]=input.nextInt();
		}
		for (int temp:marks){
			System.out.print(temp);
		}
		marks[0]=100;
		
		int failed=0;
		int total=0;
		for (int temp:marks){
			if (temp<40){
				failed+=1;
			}
			total+=temp;
		}
		System.out.print("Total failed "+failed);
		System.out.print("Average is " + (total/6.0));
	}
}