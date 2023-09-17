package CoreToWeb.IfElse;

public class DaysInTheMonth {
    public static void main(String[] args) {
        int month=7;
        if(month==0||month>12){
            System.out.println("Invalid Month");
        }else if(month==1){
            System.out.println("January Has 31 days");
        }else if(month==2){
            System.out.println("February Has 28 days or 29 days");
        }else if(month==3){
            System.out.println("March Has 31 days");
        }else if(month==4){
            System.out.println("April Has 30 days");
        }else if(month==5){
            System.out.println("May Has 31 days");
        }else if(month==6){
            System.out.println("June Has 30 days");
        }else if(month==7){
            System.out.println("July Has 31 days");
        }else if(month==8){
            System.out.println("August Has 31 days");
        }else if(month==9){
            System.out.println("september Has 30 days");
        }else if(month==10){
            System.out.println("October Has 31 days");
        }else if(month==11){
            System.out.println("November Has 30 days");
        }else if(month==12){
            System.out.println("December Has 31 days");
        }
    }
}
