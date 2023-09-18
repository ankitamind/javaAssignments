package CoreToWeb.Simple_Nested_ForLoop01;

public class pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
             char ch='C';
            for(int j=1;j<=3;j++){
            System.out.print(ch + " ");
            ch--;
            }
            System.out.println();
        }
    }
}
