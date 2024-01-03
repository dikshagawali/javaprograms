package Src;

public class Array1 {

    public static void main(String[] args){

        int[] marks_10 = {67, 89, 90, 67};
        System.out.println(marks_10.length);

        int[] a = new int[4];
        a[0] =78;
        a[0] =90;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        final  int[] b = new int[4]; // we can change the value but cannot change the length

        b[0] =78;
        a[0] =90;
        System.out.println(a[0]);


    }

}
