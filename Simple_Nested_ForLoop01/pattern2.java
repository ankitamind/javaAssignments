package CoreToWeb.Simple_Nested_ForLoop01;

public class pattern2 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            int x=4;
            for(int j=1;j<=4;j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
