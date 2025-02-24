package Array.MultidimensionalArray;

import java.io.IOException;
import java.util.Scanner;
public class program2 {
    public static void main(String[] args)throws IOException {
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[1];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
          
        }
       /* 
       for(int []x:arr){
            for(int y:x){
                System.out.print(y);
            }
            System.out.println();
       */ 
        }
    }


//Taking Input from the user