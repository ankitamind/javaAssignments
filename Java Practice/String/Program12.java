package String;
public class Program12 {
    public static void main(String[] args) {
        String str1=new String("Ankita");
        String str2="Ankita";
        String str3="Ankita";
        String str4=new String("Ankita");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}

//hashcode check the actual content 
//hashcode and identityhashcode are the different