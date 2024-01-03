package Src;

import java.sql.SQLOutput;

public class LoopExample1 {

    public static void main(String[] args){

   for (int i =1; i<=10; i++)
   {
      if(i%2==0) {

          System.out.println(i + "Is even");
      }


   }

    }
    // Exit code -0 is normal execution
    //Exit code 130 means user interrupted

}
