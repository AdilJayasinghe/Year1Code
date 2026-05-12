import java.util.*;
public class week2ii
{
	public static void main (String[] args)
	{
	//Adding
	int number3=89;
	System.out.println(number3+=1); //90
	System.out.println(number3+=8); //98
	System.out.println(number3%=11);//10
	System.out.println(number3*=2);//20
	
	
	//PrefixPostfix
	System.out.println("Prefix/Postfix");
	int number4=10;
	System.out.println(++number4);
	System.out.println(number4++);
	System.out.println(number4);
	
	//Logical and relational op
	
	int x=5;
	int y=8;
	boolean answer1=(x==5);
	boolean answer2=(x==8);
	boolean answer3=(x>0 && x<3);//and
	boolean answer4=(x>0 || x<3);//or
	boolean answer5=!(x>0 && y>5);
	System.out.println(answer1);
	System.out.println(answer2);
	System.out.println(answer3);
	System.out.println(answer4);
	System.out.println(answer5);
	
	}
}