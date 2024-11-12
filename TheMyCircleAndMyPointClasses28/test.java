package TheMyCircleAndMyPointClasses28;

public class test {
    public static void main(String[] arg){
        MyPoint a= new MyPoint(3,4);
        System.out.println(a);

        MyCircle b= new MyCircle(a,4);
        System.out.println(b);
        System.out.println("area="+b.getArea());
        System.out.println("Circumference="+b.getCircumference());

        MyCircle c=new MyCircle(1,2,3);
        System.out.println(b);
        System.out.println("area="+b.getArea());
        System.out.println("Circumference="+b.getCircumference());
        System.out.println("distance="+b.distance(c));

    }
}
