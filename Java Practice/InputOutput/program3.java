package InputOutput;
import java.io.*;
public class program3 {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter the Building name:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();

        System.out.println("Enter the Building wing no:");
        char ch=(char)br.read();
        br.skip(4);

        System.out.println(str);
        System.out.println(ch);
    }
}
