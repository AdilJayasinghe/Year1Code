import java.util.*;
public class week2i
{
	public static void main (String[] args)
	{
		int number=5.0;
		double number=5; //5.0
		String name="IIT Sri Lanka";
		boolean result=true;
		char selection='a';
		int number2;
		number2=45;

		//string handling lec:slide 12
		String name ="Informatics";
		System.out.println(name.charAt(0));//I
		System.out.println(name.index0f("f"));//2
		System.out.println(name.length);//11
		
		
		//Implict Type Conversion
		double number4=5; //int to double 5.0
		int number5=5.2; //Implict Casting Error
		int number6='5'; //Syntax Error
		
		//Explict Type casting 
		int number7= (int)5.2;//Valid
		int number8=(int)"IIT";//not Valid
		int number9=Integer.parseInt("IIT");//NumberFormatException
		double a1=Double.parseDouble("IIT");//NumberFormatException
		
		char a1='a';
		char a2='a';
		
		System.out.println(a1+a2);//Java converts char → int during arithmetic So: 97 + 97 = 194
		System.out.println("" + a1 + a2);// aa
		
		String name="IIT";
		int age=5;
		System.out.print1n(name+age); //IIT5
		System.out.println(5 + 5 + "IIT");   // 10IIT
		System.out.println("IIT" + 5 + 5);   // IIT55
		System.out.println("IIT" + (5 + 5)); // IIT10
		System.out.println(name + " " + age);// IIT 5


	}
}