package CoreToWeb.Simple_Nested_ForLoop01;

public class pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            int x=i;
            for(int j=1;j<=4;j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
