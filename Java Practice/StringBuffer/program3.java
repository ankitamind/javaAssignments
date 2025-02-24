package StringBuffer;

public class program3 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        System.out.println(str.capacity()); 

        str.append("Ankita");
        System.out.println(str);
        System.out.println(str.capacity());

        str.append("Rajendra");
        System.out.println(str);
        System.out.println(str.capacity());

        str.append("Mind");
        System.out.println(str);
        System.out.println(str.capacity()); //Recalculating capacity= Currentcapacity + 1*2

    }
}
