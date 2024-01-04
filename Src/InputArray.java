package Src;

import java.util.Scanner;

public class InputArray {



    public static void main(String[] Diksha) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){

            array[i]=sc.nextInt();
        }
        System.out.println(" --- Output");
        for(int i=0; i<n; i++){

            System.out.println(array[i]);
        }
    }

}
