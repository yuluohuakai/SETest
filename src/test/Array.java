package test;

public class Array {
    public static void main(String[] args) {

        int[] a = new int[3];
        System.out.println(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int[][] arr = new int[3][4];
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int[][] arr3 = new int[3][];
        System.out.println(arr3);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }


        String[][]arr2 = new String[3][2];
        arr2[0] = new String[]{"aa", "bb"};
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
}
