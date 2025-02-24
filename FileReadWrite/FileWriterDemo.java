package LearnCoding;
import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args)throws IOException {
            FileWriter f=new FileWriter("C:\\Users\\Acer\\Desktop\\ShubhamGawade.txt");
            f.write("Hello Gooodyaaa...Hows the josh....");
            f.close();
            System.out.println("Data wrote in file...");
    }

    }

