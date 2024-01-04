package Src;

public class Lab005 {

    public static void main(String[] Diksha) {

         int a = 10;
      //  System.out.println(--a + a++ + a--);

        //A - Exp->9, a= 9
        //B - Exp->9, a= 10
        //C - Exp->10, a=9

        System.out.println(++a + a-- + a++);

        //A - Exp->11, a= 11
        //B - Exp->11, a= 10
        //C - Exp->10, a=11
    }

}
