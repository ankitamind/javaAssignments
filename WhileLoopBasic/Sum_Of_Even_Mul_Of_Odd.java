package CoreToWeb.WhileLoopBasic;

public class Sum_Of_Even_Mul_Of_Odd {
    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        int n=10;
        int i=1;
        while(i<=10){
            if(i%2==0){
                System.out.println(sum=sum+i);
            }else{
                System.out.println(mul=mul*i);
            }
            i++;
        }
        System.out.println("The sum Of even numbers :" + sum);
        System.out.println("The Multiplication of odd numbers :" + mul);
    }
}
