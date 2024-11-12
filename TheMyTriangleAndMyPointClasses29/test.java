package TheMyTriangleAndMyPointClasses29;

import TheMyLineandMyPointClasses27.MyPoint;

public class test {
    public static void main(String[] arg){
        MyPoint a=new MyPoint(1,2);
        System.out.println(a);

        MyPoint b=new MyPoint(1,9);
        System.out.println(b);

        MyPoint c=new MyPoint(2,8);
        System.out.println(b);

        MyTriangle a1= new MyTriangle(2,3,4,5,6,7);
        System.out.println(a1);
        System.out.println("Perimenter : "+a1.getPerimenter());
        System.out.println("type : "+a1.getType());




    }
}
