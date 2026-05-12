public class week4ii
{
	public static void main(String[] args)
	{
		int[] StudentMarks=new int[5];
		StudentMarks[0] = 56;
		StudentMarks[1] = 35;
		StudentMarks[2] = 94;
		StudentMarks[3] = 34;
		StudentMarks[4] = 77;
		
		int[] StudentMarks2={56,35,94,34,77};
		
		System.out.println(StudentMarks2[0]);
		System.out.println(StudentMarks2[3]);
		
		StudentMarks2[3] = 70;
		
		System.out.println(StudentMarks2);// does not work
		
		for(int i=0;i<5;i++){
			System.out.println(StudentMark2[i]);
		}
		
		for(int i=0;i<StudentMark2.length;i++){
			System.out.println(StudentMark2[i]);
		}
		
		
		//eeeeeeeeee
		for(int temp:StudentMark2)
		{
			System.out.println(temp);
		}
		
		try
		{
			StudentMarks[5]=50;
			System.out.println(StudentMarks[5]);
		}
		catch (Exception e){
			System.out.println("Error:"+e);
		}
		
		
		//eeee
		int[] numbers = {2, 4, 6};
		int[] values = numbers;
		
		values[0] = 3;
		values[1] = 5;
		values[2] = 7;
		
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
		}
		
	}
}