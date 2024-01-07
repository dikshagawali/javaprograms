package SuperKeyword;

public class child1 extends Parent {

    String color = "black";

    void printColor()
    {
        System.out.println(color);
        System.out.println(super.color);//super can be used to refer immediate parent class instance variable
    }

    void display(){
        super.display();

        System.out.println("in child");
    }


}