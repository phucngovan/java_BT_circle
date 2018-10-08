public class Run {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle=new Circle(3,"red");
        System.out.println(circle.toString());

        Cylinder cylinder=new Cylinder();
        cylinder=new Cylinder(4,"blue",5);
        System.out.println(cylinder.toString());
        System.out.println("thể tích hình trụ= " + cylinder.getVolume() );
    }
}
