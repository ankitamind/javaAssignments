/*Given an integer value as input
 print fizz if it is divided by 3
 print buzz if it is divided by 5
 print fizz-buzz if it is divided by both
If not then print "Not divisble by both".
*/
package ControlStatements;
import java.util.*;
public class program4 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Fizz-buzz");
        }else if(num%3==0){
            System.out.println("Fizz");
        }else if(num%5==0){
            System.out.println("buzz");
        }else{
            System.out.println("Not divisible by both:");
        }
    }
}
