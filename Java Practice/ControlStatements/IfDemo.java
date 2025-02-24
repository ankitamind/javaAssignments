// Given an Integer age as  INPUT
// Print "Eligible to vote" If the person is eligible to vote

package ControlStatements;
public class IfDemo{
    public static void main(String[] args) {
        int age=16;
        if(age>=18){
            System.out.println("you are eligible for voting:");
        }else{
            System.out.println("You are not eligible");
        }
    }
}