package CoreToWeb.Simple_Nested_ForLoop02;

public class pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            char ch='F';
            int num=6;
            for(int j=1;j<=6;j++){
                if(j%2==0){
                    System.out.print(num + " ");
                   
                }else{
                    System.out.print(ch + " ");
                    
                }
                num--;
                ch--;
            }
            System.out.println();
        }
    }
}
