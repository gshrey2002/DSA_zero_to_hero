package day_2;

import java.util.Scanner;

public class spiral {
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//        System.out.println("please enter row");
//        int row=sc.nextInt();
//        System.out.println("please enter column");
//        int column=sc.nextInt();
//        int [][] arry=new int[row][column];
//        for(int c=0;c< arry.length;c++){
//           for( int r=0;r<arry[0].length;r++){
//               arry[r][c]=sc.nextInt();
//           }
//        }
//
//    }
public static void main(String args[]) {
    int arry[][] = {{1, 1, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//    print(arr);
    spiral(arry);
}
    public static void spiral(int arry[][]) {
        int minr = 0;
        int minc = 0;
        int maxr = arry.length - 1;
        int maxc = arry[0].length - 1;
int count=0;
int total=arry[0].length*arry.length;
        while (count<total) {
            for (int i = minc; i <= maxc; i++) {
                System.out.print(arry[minr][i] + " ");
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arry[i][maxc] + " ");
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc; i--) {
                System.out.print(arry[maxr][i] + " ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arry[i][minc] + " ");
                count++;
            }
            minc++;


        }
    }
}
