package String;
public class Program7 {
    public static void main(String[] args) {
        String str1="Shashi";
        String str2="Bagal";
        System.out.println(str1+str2);
        String str3="Shashi Bagal";
        String str4=str1+str2;
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
