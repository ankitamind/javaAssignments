package LearnCoding.Array;
import java.util.*;
public class LengthOFArrayDemo {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements:");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        
        }
        System.out.println("The length of the array:"+arr.length);
        
    }
}
