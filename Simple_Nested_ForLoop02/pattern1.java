package CoreToWeb.Simple_Nested_ForLoop02;

public class pattern1 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            int num=1;
            for(int j=1;j<=3;j++){
            System.out.print("C2W" + num + " ");
            num++;
            }
            System.out.println();
        }
    }
}
