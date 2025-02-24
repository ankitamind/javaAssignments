package LearnCoding.Array;
import java.util.*;
public class ReverseDemo {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Printed array elements:");
        for(int i=0;i<size;i++){
           System.out.println(arr[i]);
        }

        System.out.println("Reverse Order Of Array:");
        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]);
         }
 

    }
}
