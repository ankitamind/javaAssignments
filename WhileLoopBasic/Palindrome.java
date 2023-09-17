package CoreToWeb.WhileLoopBasic;

public class Palindrome {
    public static void main(String[] args) {
        int n=2332;
        int rev=0;
        int temp=n;
        int rem=0;
        while(n!=0){

            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp){
            System.out.println(temp + " is palindrome");
        }else{
            System.out.println(temp + " is not palindrome");
        }
    }
}
