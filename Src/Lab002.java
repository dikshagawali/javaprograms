package Src;

public class Lab002 {

    public static void main(String[] Diksha){

        System.out.println("Run Fine");
       int d =  main(10);
        System.out.println(d);
        main("");


    }

    static void main(String a){

        System.out.println("I am a Main function but JVM doesn't recongnise me");
    }

    static int main(int a){

        return a+101;
    }

}
