package Array;
import java.io.*;
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args)throws IOException {
        int arr[]=new int[5];
        System.out.println("Enter the array elements:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
              arr[i]=sc.nextInt();       
        }
        int EvenCount=0;
        int OddCount=0;

        for(int i=0;i<5;i++){
            if(i%2==0){
                EvenCount++;
            }else{
                OddCount++;
            }
        }
        System.out.println("EvenCount :"+EvenCount);
        System.out.println(" OddCount:"+OddCount);
    }
}
