import java.util.*;
public class week4tutiii
{
	public static void main(String[] args)
	{
		Double[] array={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		Scanner input = new Scanner(System.in);
		try{
			System.out.print("Enter first index");
			int i=input.nextInt();
			
			System.out.print("Enter second index to swap");
			int j=input.nextInt();
			
			Double temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			
			for (Double temp2:array){
				System.out.print(temp2);
			}
		}
		
		catch (Exception e){
			System.out.print("Error");
		}
	}
}