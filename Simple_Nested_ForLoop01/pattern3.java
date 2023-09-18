package CoreToWeb.Simple_Nested_ForLoop01;

public class pattern3 {
   public static void main(String[] args) {
        int x=14;
        for(int i=1;i<=4;i++){
           
            for(int j=1;j<=4;j++){
                System.out.print(x + " ");
            }
            x++;
            System.out.println();
        }
   } 
}
