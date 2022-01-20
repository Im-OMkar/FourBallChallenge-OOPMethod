public class Balls {
    public static final int DIAMETER = 10;
    int hPos=0;
    int vPos;
    int velX;
    OopMethod instance;


    public Balls(int vPos, int velX, OopMethod instance) {
        this.vPos= vPos;
        this.velX= velX;
        this.instance= instance;
    }

    public void Display(){
        instance.ellipse(hPos, vPos, DIAMETER, DIAMETER);
    }

    public void move(){
        hPos+=velX;
    }
}
