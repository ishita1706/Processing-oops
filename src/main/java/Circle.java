import processing.core.PApplet;

public class Circle {
    public float x_axis;
    public float y_axis;
    public float radius;
    public float speed;
    public PApplet pAppletInstance;

    public Circle(PApplet pAppletInstance,int x_axis,int y_axis, float radius, float speed){
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.radius = radius;
        this.speed = speed;
        this.pAppletInstance = pAppletInstance;
    }

    public void drawCircle(){
        pAppletInstance.ellipse(x_axis,y_axis,radius,radius);
        push_coordinate();
    }

    private void push_coordinate(){
        this.x_axis += speed;
    }
}