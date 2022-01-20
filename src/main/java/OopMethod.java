import processing.core.PApplet;

public class OopMethod extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Balls ball1;
    Balls ball2;
    Balls ball3;
    Balls ball4;

    public static void main(String[] args) {
        PApplet.main("OopMethod");
    }

    public void settings(){
        size(WIDTH, HEIGHT);
    }

    public void setup(){
        int generalHeight= HEIGHT/5;
        ball1= new Balls(1*generalHeight, 1, this);
        ball2= new Balls(2*generalHeight, 2, this);
        ball3= new Balls(3*generalHeight, 3, this);
        ball4= new Balls(4*generalHeight, 4, this);
    }

    public void draw(){
        ball1.Display();
        ball1.move();
        ball2.Display();
        ball2.move();
        ball3.Display();
        ball3.move();
        ball4.Display();
        ball4.move();
    }
}
