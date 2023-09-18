package CoreToWeb.Simple_Nested_ForLoop01;

public class pattern5 {
    public static void main(String[] args) {
        int x=12;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(x + " ");
            }
            x--;
            System.out.println();
        }
    }
}
