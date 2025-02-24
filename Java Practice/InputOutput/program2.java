package InputOutput;
import java.io.*;
public class program2 {
    public static void main(String[] args)throws IOException {
            System.out.println("Enter the player name:");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str=br.readLine();

            System.out.println("Enter the player jercyNo:");
            int num=Integer.parseInt(br.readLine());

            System.out.println("Enter the player Average:");
            float Avg=Float.parseFloat(br.readLine());

            System.out.println(str);
            System.out.println(num);
            System.out.println(Avg);

    }
}
