package CoreToWeb.Array.Array01;
import java.io.*;
public class Product_Odd_Index {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
       
        int product=1;
        for(int j=0;j<size;j++){
            if(j%2==1){
                product=arr[j]*product;
            }
        }
        System.out.println("The product of the odd index is:" + product);
    }
}
