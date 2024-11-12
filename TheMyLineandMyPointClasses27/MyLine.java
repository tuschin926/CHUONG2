package TheMyLineandMyPointClasses27;

public class MyLine {
    MyPoint begin;
    MyPoint end;
    MyLine (int x1, int y1, int x2,int y2){
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2,y2);
    }
    MyLine(MyPoint begin,MyPoint end){
        this.begin=begin;
        this.end=end;
    }
    MyPoint getBegin(){
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    MyPoint getEnd(){
        return  end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    int getEndY(){
        return end.getY();
    }
    public void setEndy(int y){
        end.setY(y);
    }
    int[] getBeginXY(){
        return new int[]{begin.getX(),begin.getY()};
    }
    public void setBeginXY(int x, int y){
       begin.setXY(x,y);
    }
    int[] getEndXY(){
        return new int[]{end.getX(),end.getY()};
    }
    public void setEndXY(int x,int y){
        end.setXY(x,y);
    }
    double getLength(){
        return begin.distance(end);
    }

    double getGradient(){
        int xDiff=end.getX()-begin.getX();
        int yDiff=end.getY()-begin.getY();
        return Math.atan2(yDiff,xDiff);
    }
    public String toString(){
        return "MyLine[begin="+begin+",end="+end+"]";
    }

}
