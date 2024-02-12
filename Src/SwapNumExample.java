package Src;

import java.util.Scanner;

public class SwapNumExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the  number2: ");
        int num2 = sc.nextInt();
        System.out.printf("Before Swapping number is num1 = %d and num2 = %d\n",num1,num2);
        int temp = num1;
        num1 = num2;
        num2 =  temp;

       System.out.printf("After Swapping number is num1 = %d and num2 = %d\n",num1,num2);
    }
}