package LearnCoding;
import java.io.*;
public class RenamFileDemo {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Acer\\Desktop\\ShubhamGawade.txt");
        File r=new File("C:\\Users\\Acer\\Desktop\\Shubham.txt");

        if(f.exists()){
            System.out.println(f.renameTo(r));
        }else{
            System.out.println("File not exists...");
        }
    }
}
