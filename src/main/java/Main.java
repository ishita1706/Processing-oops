import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

public class Main extends PApplet{
    public static final int  WIDTH= 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 25;
    public static List<Circle> circles = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("Main",args);
    }

    public Main(){
        circles.add(new Circle(this,0, HEIGHT/5, RADIUS, 2));
        circles.add(new Circle(this,0, 2*HEIGHT/5, RADIUS, 4));
        circles.add(new Circle(this,0, 3*HEIGHT/5, RADIUS, 6));
        circles.add(new Circle(this,0, 4*HEIGHT/5, RADIUS, 8));
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw(){
        for(Circle circle: circles){
            circle.drawCircle();
        }
    }
}