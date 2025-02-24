package LearnCoding.Array;
import java.util.*;
public class AverageOfArrayDEmo { 
    public static void main(String[] args) {
        int sum=0; 
        double average;
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
       
        for(int i=0;i<size;i++){
          sum=arr[i]+sum;
        }
        average=sum/size;
        System.out.println("Sum of The array is:"+sum);
        System.out.println("Average of The array is:"+average);
        
    }
}
