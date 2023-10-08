package day_1;

import java.util.Scanner;

    public class jaggedarray {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("pls enter how many rows");
            int n=sc.nextInt();
            int arr[][]=new int[n][];
//input array
            for(int i =0;i<arr.length;i++){
                System.out.println("enter how many column in row ");
                int c=sc.nextInt();
                arr[i]=new int[c];
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            //print array
            for(int i=0;i<arr.length;i++){

                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }


