package String;

public class Program4 {
    public static void main(String[] args) {
        int arr1[]={10,200,300};
        int arr2[]={10,200,300};

        System.out.println(System.identityHashCode(arr1[0]));
        System.out.println(System.identityHashCode(arr1[1]));
        System.out.println(System.identityHashCode(arr2[2]));

        System.out.println(System.identityHashCode(arr2[0]));
        System.out.println(System.identityHashCode(arr2[1]));
        System.out.println(System.identityHashCode(arr2[2]));

    }
}
