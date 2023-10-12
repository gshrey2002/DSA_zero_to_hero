package day_1;

public class horizontalwaves {
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        horizon(arr);
    }
    public static void horizon(int arr[][]){
        for(int array=0;array<arr.length;array++){
            if(array%2==0){
                for(int col=0;col<arr[array].length;col++){
                    System.out.print(arr[array][col] + " ");

                }
            }else{
                for(int rev=arr[array].length-1;rev>=0;rev--){
                    System.out.print(arr[array][rev] + " ");

                }
            }


    }

}}
