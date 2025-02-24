//Take an integer and print whether it is divided by 4 or not

package ControlStatements;
import java.util.*;
public class program3 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println(n + "Is divided by 4");
        }else{
            System.out.println(n + "Is not divided by 4");
        }
    }
}
