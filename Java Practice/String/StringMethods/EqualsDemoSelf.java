package String.StringMethods;

import java.util.Scanner;

public class EqualsDemoSelf {
    static int myStrLength(String str){
        char[]arr=str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        return count;
        
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        if(myStrLength(str1)==(myStrLength(str2))){
            System.out.println("equals");
        }else{
            System.out.println("Not equal");
        }
        
    }
}
