package CoreToWeb.Simple_Nested_ForLoop03;

public class program8 {
    public static void main(String[] args) {
        char ch='J';
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}
