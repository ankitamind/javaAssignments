package LearnCoding;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args)throws Exception {
            BufferedReader obj=new BufferedReader(new FileReader("C:\\Users\\Acer\\Desktop\\ShubhamGawade.txt"));
            String str;
            while((str=obj.readLine())!=null){
                System.out.print(str);
             }
             obj.close();
    }
}
