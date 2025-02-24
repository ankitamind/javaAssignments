package InputOutput;
import java.util.*;
import java.io.*;
public class Program1 {
    public static void main(String[] args)throws IOException {
        /*System.out.println("Enter batsman name:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
        */

        System.out.println("Enter batsman name:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sc=br.readLine();
        System.out.println("Batsman name is:" + sc);

    }
}
