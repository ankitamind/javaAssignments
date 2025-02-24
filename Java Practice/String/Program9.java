package String;
public class Program9 {
    public static void main(String[] args) {
        String str1="Shashi";
        String str2=new String("Shashi");

        if(str1==str2)//== checks the identityhashcode thats why it return not equal.
        {
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }

    }
}
