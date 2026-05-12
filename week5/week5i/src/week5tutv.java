public class week5tutv {
    public static void main(String[] args) {
        int number =10;
        int exponent =3;
        System.out.print(multiply(number,exponent));
    }
    public static int multiply(int number, int exponent){
        if (exponent<0){
            return 1;
        }
        return number * multiply(number, exponent-1);
    }
}
