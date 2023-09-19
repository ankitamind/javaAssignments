package CoreToWeb.Simple_Nested_ForLoop04;

public class pattern8 {
    public static void main(String[] args) {
        int num=10;
        int row=4;
        char ch='J';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print(num+ " ");
                }else{
                    System.out.print(ch+ " ");
                }
                 num--;
                 ch--;
            }
           
            System.out.println();
        }
    }
}
