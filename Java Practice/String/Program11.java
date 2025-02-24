package String;

public class Program11 {
    public static void main(String[] args) {
        String str1="Ankita";
        String str2="Ankita";
        String str3=new String("Aniket");
        if(str1.equals(str3)) //Here,equals() method compare the actually content
        {
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
