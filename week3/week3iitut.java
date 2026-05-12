import java.util.*;
public class week3iitut
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=2;i<=8;i+=2){
			for (int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=1;i<=5;i++){
			for(int s =1;s<=5-i;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=5;i>=1;i--){
			for(int s =1;s<=5-i;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
	}	
}

