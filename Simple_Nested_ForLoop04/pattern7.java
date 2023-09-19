package CoreToWeb.Simple_Nested_ForLoop04;

public class pattern7 {
    public static void main(String[] args) {
        int num=1;
        char ch='F';
        int row=6;
        for(int i=1;i<=row;i++){
            char temp=ch;
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print(temp++ + " ");
                }else{
                    System.out.print(num++ + " ");
                }
            }
            ch--;
            System.out.println();
        }
    }
}
