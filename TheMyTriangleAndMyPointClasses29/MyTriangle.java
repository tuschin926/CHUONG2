package TheMyTriangleAndMyPointClasses29;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;
    MyTriangle(int x1,int y1,int x2, int y2, int x3,int y3){
        this.v1 =new MyPoint(x1,y1);
        this.v2 =new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);
    }
    MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }


    public String toString() {
        return "MyTriangle[v1="+v1+",v2="+v2+",v3="+v3+"]";
    }
    double getPerimenter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }
    String getType(){
        double a=v1.distance(v2);
        double b=v2.distance(v3);
        double c=v3.distance(v1);

        if(a==b && b==c &&c==a){
            return "equilateral";
        } else if (a==b || b==c ||c==a ){
            return "isosceles";
        }else{
            return "scalene";
        }

    }
}
