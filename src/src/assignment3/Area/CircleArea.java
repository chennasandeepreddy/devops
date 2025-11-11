package assignment3.Area;

public class CircleArea {
    public static void main(String[] args) {
        int radius = 4;
        double area = circleArea(radius);
        System.out.println("Area of circle is "+ area);
    }
    public static double circleArea(int radius){
        double area = Math.PI*Math.pow(radius,2);
        return area;
    }
}
