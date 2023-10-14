package CoreToWeb.Array.Array01;
import java.io.*;
public class Product_EvenNo {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int product=1;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                product=arr[i]*product;
            }
        }
        System.out.println("product of even number is:" + product);
    }
}
