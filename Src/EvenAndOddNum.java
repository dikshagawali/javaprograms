package Src;

import java.util.Scanner;

public class EvenAndOddNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int rem = n % 2;

        if(rem==0){

            System.out.println("This is even number");
        }

        else
        {
            System.out.println("This is odd even number");
        }
    }
}