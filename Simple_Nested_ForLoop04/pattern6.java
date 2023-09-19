package CoreToWeb.Simple_Nested_ForLoop04;

public class pattern6 {
    public static void main(String[] args) {
        int row=4;
        int num=1;
        for(int i=1;i<=row;i++){
            int temp=i;
            for(int j=1;j<=i;j++){
                System.out.print(temp++ +" ");
            }
            System.out.println();
        }
    }
}


