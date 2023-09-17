package CoreToWeb.WhileLoopBasic;

public class Countdown_Of_Days_For_Assignment {
    public static void main(String[] args) {
        int day=7;
        if(day==0){
            System.out.println(day + " days for Assignment is Overdue");
        }else{
            while(day>=1){
                System.out.println(day + "days remaining");
                day--;
            }
            if(day==0){
                System.out.println(day + "days remaining is overdue");
            }
        }

    }
}
