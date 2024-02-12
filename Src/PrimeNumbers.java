package Src;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){

            if(n%i==0){

                count++;
            }
        }
     if(count==2){

         System.out.println("prime number");
     }
 else {

         System.out.println("Not prime number");
     }
    }
}