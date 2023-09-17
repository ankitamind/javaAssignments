package CoreToWeb.IfElse;

public class Maximum {
    public static void main(String[] args) {
        int num1=1,num2=2,num3=3;

        if(num1>num2 && num1>num3){
            System.out.println(num1 + "is maximum than"+ num2 + " " + num3);
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 + "is maximum than" + num1 +" " + num3);
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3  + " is maximum than " + num1 +" " + num2);
        }else
        {
            System.out.println("All numbers are euqal");
        }
    }
}
