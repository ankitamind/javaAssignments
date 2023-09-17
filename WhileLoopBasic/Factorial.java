package CoreToWeb.WhileLoopBasic;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int i=1;
        int n=6;
        while(i<=n){
           fact=fact*i;
           i++;

        }
        System.out.println("Factorial of " +  n  + " is "+ fact);
    }
}
