package CoreToWeb.Simple_Nested_ForLoop04;

public class pattern2 {
    public static void main(String[] args) {
    
    int row=5;
    int n=1;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            System.out.print(n++ + " ");
        }
        n++;
        System.out.println();
    }
 }
}
