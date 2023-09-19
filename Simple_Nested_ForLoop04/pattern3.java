package CoreToWeb.Simple_Nested_ForLoop04;

public class pattern3 {
  public static void main(String[] args) {
    int row=4;
    int n=10;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            System.out.print(n-- +" ");
        }
       
        System.out.println();
        n++;
    }

  }
}
