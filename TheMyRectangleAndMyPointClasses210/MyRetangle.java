package TheMyRectangleAndMyPointClasses210;

public class MyRetangle {
    MyPoint topLeft;
    MyPoint bottomRinght;

    MyRetangle (int x1, int y1, int x2, int y2){
        this.topLeft=new MyPoint(x1,y1);
        this.bottomRinght=new MyPoint(x2,y2);
    }
    MyRetangle (MyPoint topLeft, MyPoint bottomRinght){
        this.topLeft=topLeft;
        this.bottomRinght=bottomRinght;
    }
    MyPoint getTopLeft(){
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
    int getTopLeftX(){
        return topLeft.getX();
    }
    public void setTopLeftX(int x){
        topLeft.setX(x);
    }
    int getTopLeftY(){
        return topLeft.getY();
    }
    public void setTopLefYt(int y){
        topLeft.setY(y);
    }
    MyPoint getBottomRinght(){
        return bottomRinght;
    }
    public void setBottomRinght(){
        this.bottomRinght=bottomRinght;
    }
    int getBottomRinghtX(){
        return bottomRinght.getX();
    }

    public void setBottomRinghX() {
        bottomRinght.getY();
    }
}
