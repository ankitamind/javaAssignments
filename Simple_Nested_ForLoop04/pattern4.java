package CoreToWeb.Simple_Nested_ForLoop04;

public class pattern4 {
    public static void main(String[] args) {
        int num=1;
        int row=4;
        for(int i=1;i<=row;i++){
            int temp=i;
            for(int j=1;j<=(row-i+1);j++){
                System.out.print(temp+ " ");
                temp++;
            }
            System.out.println();

        }
    }

}
