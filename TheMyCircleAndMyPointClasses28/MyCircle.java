package TheMyCircleAndMyPointClasses28;

public class MyCircle {
    MyPoint center = new MyPoint(0,0);
    int radius;
    MyCircle(MyPoint center,int radius){
        this.center=center;
        this.radius=radius;
    }
    MyCircle(int x,int y,int radius){
        this.center= new MyPoint(x,y);
        this.radius=radius;
    }
    int getRadius(){
        return  radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    MyPoint getCenter(){
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    int getCenterX(){
        return center.x;
    }
    public void setCenteX(int x){
        center.getX();
    }
    int getCenterY(){
        return center.y;
    }
    public void setCenterY(int y){
        center.getY();
    }
    int[] getCenterXY(){
        return new int[]{getCenterX(),getCenterY()};
    }
    public void setCenterXY(int x,int y){
        center.getXY();
    }
    public String toString(){
        return "MyCircle[radius="+radius+",centrer="+center+"]";
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    double getCircumference(){
        return 2*Math.PI*radius;
    }
    double distance(MyCircle another){
        return center.distance(another.center);
    }
}
