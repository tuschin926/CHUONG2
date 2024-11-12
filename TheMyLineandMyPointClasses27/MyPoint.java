package TheMyLineandMyPointClasses27;

public class MyPoint {
    int x=0;
    int y=0;
    MyPoint(){
        x=0;
        y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    int[] getXY() {
        return new int[]{x,y};
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method to calculate distance from this point to the origin (0, 0)
    public double distance() {
        return Math.sqrt(x*x + y*y);
    }


}
