package LearnCoding.Array;
import java.util.*;
public class SearchOFArrayDemo {
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

        int searchElement,count=0;
        System.out.println(" Enter the element which you want to search:");
        searchElement =sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==searchElement){
                count++;
            }
        }if(count>0){
            System.out.println( searchElement + "Element found successfully");
        }else{
            System.out.println("Not found ");
        }

    }
}
