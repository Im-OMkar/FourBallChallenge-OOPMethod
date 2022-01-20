import processing.core.PApplet;

public class OopMethod extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static Balls[] ball= new Balls[4];

    public static void main(String[] args) {
        PApplet.main("OopMethod");
    }

    public void settings(){
        size(WIDTH, HEIGHT);
    }

    public void setup(){
        int generalHeight= HEIGHT/5;
        for(int i=1; i<=4; i++){
            ball[i-1]= new Balls(i*generalHeight, i, this);
        }
    }

    public void draw(){
        for(int i=0; i<4; i++){
            ball[i].Display();
            ball[i].move();
        }
    }
}
