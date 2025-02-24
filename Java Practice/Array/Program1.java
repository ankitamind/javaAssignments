package Array;
import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the array numbers:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("printed elements:");
        for(int j=0;j<5;j++){
            System.out.println(arr[j]);
        }
    }
}
