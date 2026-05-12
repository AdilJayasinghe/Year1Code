import java.util.Scanner;
public class week5ii {
    public static void main(String[] args){
        DisplayName();
        EnterNumbers();
    }

    public static void DisplayName(){
        System.out.println("IIT");
    }


    //  Add
    public static void EnterNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int number1 = input.nextInt();

        System.out.print("Enter numbers: ");
        int number2 = input.nextInt();

        AddNumbers(number1,number2);
        int result=MultiplyNumbers(number1,number2);
        System.out.println("The result is: " + result);

    }
    public static void AddNumbers(int no1,int no2){
        int result=no1+no2;
        System.out.println("Addition of "+no1+" and "+no2+" is "+result);
    }
    //Multiply
    public static int MultiplyNumbers(int no1,int no2){
        int result=no1*no2;
        return result;
    }



}
