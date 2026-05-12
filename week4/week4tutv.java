import java.util.*;
public class week4tutv
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double[][] marks = new double[5][3];
		
		for (int i=0;i<=4;i++){
			System.out.println("Student " + (i+1));
			for (int j=0;j<=2;j++){
				System.out.println("Mark " + (j+1));
				marks[i][j] = input.nextDouble();
			}
		}
		
		for(int i = 0; i <5; i++) {
			double total=0;
				for (int j = 0; j <3; j++) {
					total=total+marks[i][j];
				}
			double average=total/3;
			System.out.println(average);
        }
		
	}
}