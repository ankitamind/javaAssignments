package CoreToWeb.WhileLoopBasic;

public class Count_Of_Digits {
    public static void main(String[] args) {
        int digit=942111423;
        int count=0;
    
        while(digit!=0){
            count++;
            digit=digit/10;
        }
        System.out.println("The counts of digits " + count);
    }
}
