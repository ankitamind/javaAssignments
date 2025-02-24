package Array;
import java.io.*;
public class Program3 {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter Array elemnts:");
        int arr[]=new int[5];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int sum=0;
        for(int j=0;j<5;j++){
            sum=sum+arr[j];
        }
        System.out.println("Sum Of the Array :"+sum);
    }
}
