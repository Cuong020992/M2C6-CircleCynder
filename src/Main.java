public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle(3,"blue");
        System.out.println(circle);
        System.out.println("Diện tích hình tròn: "+circle.getArea());

        Cylinder cylinder = new Cylinder(10,"red",4);
        System.out.println("Thể tích hình trụ: "+cylinder.getVolume());

    }
}
