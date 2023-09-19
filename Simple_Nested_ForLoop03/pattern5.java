package CoreToWeb.Simple_Nested_ForLoop03;

public class pattern5 {
    public static void main(String[] args) {
        int num=10;
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }
}
