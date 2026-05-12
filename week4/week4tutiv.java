import java.util.*;
public class week4tutiv
{
	public static void main(String[] args)
	{
		Int [] A={2,3,4,5,6,7,8,9};
		for (int i =0;i<A.length;i++){
			if(A[i]%2==0){
				System.out.print(A[i] + " ");
			}
		}
		
		for (int i=0;i<A.length;i++){
			int doubled = A[i]*2;
			
			for (int j=0;j<A.length;j++){
				if (A[j] == doubled){
					System.out.print(A[i] + " ");
				}
			}
		}
			
		While(i<A.length){
			if(A[i]%2==0){
				System.out.print(A[i] + " ");
			}
			i++
		}
		
		
		While(i<A.length){
			int doubled = A[i]*2;
			
			for (int j=0;j<A.length;j++){
				if A[j] == doubled){
					System.out.print(A[i] = " ");
				}
				j++
			}
			i++
		}
	}
}