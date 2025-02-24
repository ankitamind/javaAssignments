package LearnCoding.Array;
import java.util.*;
public class AscendingDemo {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println("The ascending Order Of the array");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        
    }
}
