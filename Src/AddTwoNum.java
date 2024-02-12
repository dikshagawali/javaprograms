package Src;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        int n3 = n1 + n2;
        System.out.println("Addition of two number is " + n3);
        System.out.printf("%d+%d = %d",n1,n2,n3);

    }
}