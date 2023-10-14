package CoreToWeb.Array.Array01;
import java.io.*;
public class Divisible_five {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array: ");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Multiples of five");
        for(int j=0;j<size;j++){
            if(arr[j]%5==0){
                System.out.println(+arr[j]);
            }
        }

    }
}
