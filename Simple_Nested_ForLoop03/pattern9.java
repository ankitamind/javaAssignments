package CoreToWeb.Simple_Nested_ForLoop03;

public class pattern9 {
    public static void main(String[] args) {
        int num=1;
        int row=3;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num*num*num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
