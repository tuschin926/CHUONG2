package TheMyLineandMyPointClasses27;


public class test {
    public static void main(String[] arg){
        MyPoint p1 = new MyPoint(7,8);
        System.out.println(p1);


        MyPoint p2 = new MyPoint(5, 4);
        System.out.println(p2);


        MyLine a1= new MyLine(p1,p2);
        System.out.println(a1);
        System.out.println("length : "+a1.getLength());
        System.out.println("Gradient : "+a1.getGradient());
        System.out.println("distance : "+p1.distance(p2));


    }
}
