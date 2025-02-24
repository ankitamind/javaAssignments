package Array.MultidimensionalArray;

public class JaggedArrayDemo4 {
    public static void main(String[] args) {
        int arr2[][]={{1,2,3},{4,5},{7}}; //1st way of declaration

        int arr[][]=new int[3][]; //2nd way of declaration
        arr[0]=new int[]{1,2,3};
        arr[1]=new int[]{4,5};
        arr[2]=new int[]{7};
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
