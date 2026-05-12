public class week5i {
    public static void main(String[] args) {
        int [][] table={{1,2,3},{4,5,6},{7,8,9}};

        int [][] studentInfoTable=new int [3][4];

        studentInfoTable[0][0]=1;
        studentInfoTable[1][1]=2;
        studentInfoTable[2][2]=3;

        int [][] raggedArrayExample=new  int[3][];
        raggedArrayExample[0]=new int [0];
        raggedArrayExample[1]=new int [1];
        raggedArrayExample[2]=new int [2];

        for(int i = 0; i < raggedArrayExample.length; i++) {
            for (int j = 0; j < raggedArrayExample[i].length; j++) {
                System.out.print(raggedArrayExample[i][j] + " ");
            }
        }
    }
}
