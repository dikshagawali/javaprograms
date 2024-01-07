package Abstraction;

class Honda extends AbstractClass {

    void run(){
        System.out.println("running safely");
    }

    public static void main(String[] args){

        AbstractClass ab = new Honda();
        ab.run();


    }

}
