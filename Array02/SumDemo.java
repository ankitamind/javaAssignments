package LearnCoding.Array;
import java.util.*;
public class SumDemo {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements:");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        
        }
        System.out.println("Print the array elements:");
        for(int i=0;i<size;i++){
           System.out.println(arr[i]);
        
        }
        int sum=0;  
        for(int i=0;i<size;i++){
          sum=arr[i]+sum;
        
        }
        System.out.println("Sum of the array:"+sum);
       
        
    }
}
