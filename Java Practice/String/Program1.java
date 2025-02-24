package String;

public class Program1 {
    public static void main(String[] args) {
        String str=new String("Ankita");  //Heap
        String str1="Ankita";                      //String Constant pool
        char ch[]={'C','2','W'};                   //Integer Cache

        System.out.println(str);
        System.out.println(str1);
        System.out.println(ch);
    }
}
