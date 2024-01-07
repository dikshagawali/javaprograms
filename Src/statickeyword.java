package Src;

public class statickeyword {


          static int count=0;//will get memory only once and retain its value

    statickeyword() {
            count++;//incrementing the value of static variable
            System.out.println(count);
        }

        public static void main(String args[]){
//creating objects
            statickeyword c1=new statickeyword();
            statickeyword c2=new statickeyword();
            statickeyword c3=new statickeyword();
        }
    }


