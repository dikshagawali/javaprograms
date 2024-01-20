package Interface;

public class testInterface {

    public static void main(String args[]) {
        Drawable d = new Circle();//In real scenario, object is provided by method e.g. getDrawable()
        Drawable d1 = new Rectangle();

        d.draw();
        d1.draw();

    }
    }
