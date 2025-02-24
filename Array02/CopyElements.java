package LearnCoding.Array;
import java.util.*;
public class CopyElements {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        System.out.println("Enter the array elements:");

        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        
        }

        System.out.println("First array elements:");

        for(int i=0;i<size;i++){
            System.out.println(arr1[i]);
        
        }

        System.out.println("Second array elements:");

        for(int i=0;i<size;i++){
            arr2[i]=arr1[i];
            System.out.println(arr2[i]);
        
        }
        
    }
}
