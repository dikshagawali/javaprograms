package Src;

public class copyArray {


    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[arr1.length];
        //System.out.println(arr2=arr1);
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }



    }

}
