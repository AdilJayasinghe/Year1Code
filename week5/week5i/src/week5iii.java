public class week5iii {
    public static void main(String[] args) {
        int marks [] ={65,35,25,67,83,87,93,57,77,27};
        checkSummary(marks);
        StandardizeMarks(marks);
        for (int temp: marks) {
            System.out.print(temp+" ");
        }
    }
    public static void checkSummary(int[] marks){

        System.out.println(calcTotal(marks));
        System.out.println(calcAverage(calcTotal(marks),marks.length));
    }
    public static int calcTotal(int[] marks){
        int total=0;
        for (int i=0;i<marks.length;i++){
            total=total+marks[i];
        }
        return total;
    }
    public static int calcAverage(int total, int length){
        int average;
        average=total/(length+1);
        return average;
    }
    public static void StandardizeMarks(int[] marks){
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }
}
