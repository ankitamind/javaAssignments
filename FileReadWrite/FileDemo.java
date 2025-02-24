package LearnCoding;
import java.io.File;

public class FileDemo {
    public static void main(String[] args)throws Exception {
        File f=new File("C:\\Users\\Acer\\Desktop\\ShubhamGawade.txt");
        if(f.exists()){
            System.out.println("File Name:" + f.getName());
            System.out.println("File Location:" + f.getAbsolutePath());
            System.out.println("File Writable:" + f.canWrite());
            System.out.println("File Readble:" + f.canRead());
            System.out.println("File Size:" + f.length());
            System.out.println("File Removed:" + f.delete());

        }else{
            System.out.println("File Dosent Exists...");
        }

    }
}
