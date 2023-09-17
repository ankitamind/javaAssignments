package CoreToWeb.WhileLoopBasic;

public class Count_Of_OddInt {
    public static void main(String[] args) {
        int count=0;
        int no=942111423;
        while(no !=0){
         
            int rem=no%10;
            if(rem%2==1){
                count++;
            }
            no=no/10;
        }
        System.out.println("Count of the odd digit " + count);
    }
}
