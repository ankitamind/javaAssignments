package LearnCoding;

import java.io.File;
public class createFile {
    public static void main(String[] args) throws Exception{
        File f=new File("C:\\Users\\Acer\\Desktop\\Ankita.txt");
        if(f.createNewFile()){
            System.out.println("File created...");
        }else{
            System.out.println("File already Existed...");
        }
    }
}
