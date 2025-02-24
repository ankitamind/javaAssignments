package Array;
import java.io.*;
public class program2 {
    public static void main(String[] args)throws IOException {
        System.out.println("Enter the array elements:");
        int arr[]=new int[5];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("printed array elements:");
        for(int j=0;j<5;j++){
            System.out.println(arr[j]);
        }

    }
}
