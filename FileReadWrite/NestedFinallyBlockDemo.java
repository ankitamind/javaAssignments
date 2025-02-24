package LearnCoding;

public class NestedFinallyBlockDemo {
    public static void main(String[] args) {
        try{
            int a=10,b=10,c;
            c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Exception...");
        }finally{
            try{
                System.out.println(10/9);
            }catch(ArithmeticException a){
                System.out.println("Arithmetic Exception");
            }finally{
                System.out.println("Program Ended...");
            }
        }
    }
}
