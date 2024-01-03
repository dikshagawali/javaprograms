package Src;

public class LoopExample2 {

    public static void main(String[] args){

for(int i =1; i<=10; i++){

    if (i%2==0){

        System.out.println("Val Even of ->" + i);
        continue;
    }

    System.out.println("Val odd of ->" + i);
}
      
   }

    }
    // Exit code -0 is normal execution
    //Exit code 130 means user interrupted


