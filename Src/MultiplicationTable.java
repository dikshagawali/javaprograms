package Src;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){

          int ans = n * i;
           // System.out.println("Multiplication table is " + ans );
            System.out.printf("%d * %d = %d\n",n,i,ans);
        }


    }
}