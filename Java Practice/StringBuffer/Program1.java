package StringBuffer;

public class Program1 {
    public static void main(String[] args) {
            StringBuffer str1=new StringBuffer("Ankita");
            System.out.println(System.identityHashCode(str1));

            str1.append("Mind");
            System.out.println(str1);
            System.out.println(System.identityHashCode(str1));
    }
}


//In string there will be new object created if append the string and print it.But in StringBUffer There is no need of craeting object.
//String is immutable thats why stringBuffer will be in picture.