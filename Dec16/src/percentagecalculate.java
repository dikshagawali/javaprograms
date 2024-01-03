
package Dec16.src;
import java.util.*;

public class percentagecalculate {



    public static void main(String[] args) {

        float percentage;
        float total_marks;
        float scored;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Marathi subject");

        int a1 = sc.nextInt();
        System.out.println("Enter marks of Hindi subject");
        int a2 = sc.nextInt();

        System.out.println("Enter marks of Maths subject");
        int a3 = sc.nextInt();
        System.out.println("Enter marks of history subject");
        int a4 = sc.nextInt();
         scored = a1 + a2 + a3 + a4;
        System.out.println("total marks of all subject:"    +scored);

        percentage = (scored / 400) * 100;
        System.out.println("Percentage ::"+ percentage);



    }

}
