package CoreToWeb.Simple_Nested_ForLoop02;

public class pattern2 {
    public static void main(String[] args) {
        int x=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(x + " ");
            }
            x++;
            System.out.println();
        }
    }
}
