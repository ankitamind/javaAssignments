package Array.IntegerCache;

public class Program2 {
    public static void main(String[] args) {
        int x=10;
        Integer a=new Integer(10); //due to new keyword object will be created newly.
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(a));
    }
}
