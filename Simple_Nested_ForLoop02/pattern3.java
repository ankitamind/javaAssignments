package CoreToWeb.Simple_Nested_ForLoop02;

public class pattern3 {
    public static void main(String[] args) {
      
        for(int i=1;i<=4;i++){
              int num=14+i-1;
              for(int j=1;j<=4;j++){
                System.out.print(num + " ");
                num++;
              }
              System.out.println();
        }
    }
}
