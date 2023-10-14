package CoreToWeb.Array.Array01;
import java.io.*;
public class Sum_OddNo {
    public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of the array:");
    int size=Integer.parseInt(br.readLine());
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=Integer.parseInt(br.readLine());
    }
    int sum=0;
    for(int j=0;j<size;j++){
        if(arr[j]%2==1){
            sum=arr[j]+sum;
        }
    }
    System.out.println("sum of odd digit is:" +sum);
}
}
