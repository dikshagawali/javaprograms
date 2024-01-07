package Src;

public class person {

    String name;
    String phone;

    String email;

   /* void talk(){

        System.out.println(phone);
    }*/

    /* person(String p){

        this.phone = p;

     }*/
    person(String n, String e, String p){

  this.name = n;
  this.email = e;
  this.phone=p;
    }
   void display(){

       System.out.println(name+"  "+email+ " "+phone);
       //System.out.println(phone);
   }


}
