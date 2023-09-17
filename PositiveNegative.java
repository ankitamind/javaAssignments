package CoreToWeb.IfElse;

public class PositiveNegative {
    public static void main(String[] args) {
        int num=5;
        if(num<0){
            System.out.println(num + " is negative number");
        }else if(num>0){
            System.out.println(num + " is positive number");
        }else{
            System.out.println(num + " is neither positive nor negavtive");
        }
    }
}
