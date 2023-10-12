package day_2;

import java.util.Scanner;

public class searching_in_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{3, 30, 38}, {44, 52, 54}, {57, 60, 69}};
        int x = sc.nextInt();
        System.out.println(search(arr,x));

    }
    public static int search(int[][] arr,int x){

       int row=0;
       int column=arr[0].length-1;
       while(column>=0 && row< arr.length){
        if(arr[row][column]==x)
        {
//            System.out.println("element Found");
            return 1;
        } else if (arr[row][column]>x) {
            row++;


        }else {
          //  arr[row][column]<x condition
            column--;

        }

       }
       return 0;
    }

}
