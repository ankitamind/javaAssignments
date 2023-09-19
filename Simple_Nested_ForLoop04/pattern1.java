package CoreToWeb.Simple_Nested_ForLoop04;

public class pattern1 {
    public static void main(String[] args) {
        int num=10;
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("C2W"+num-- + " ");
               
            }
            System.out.println();
        }
    }
}
