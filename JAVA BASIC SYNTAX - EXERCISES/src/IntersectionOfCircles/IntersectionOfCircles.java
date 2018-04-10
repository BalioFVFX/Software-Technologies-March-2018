package IntersectionOfCircles;

import java.util.Scanner;

public class IntersectionOfCircles {

    public static class Point{
        public double x;
        public double y;
    }

    public static class Circle{
        public double distance;
        public double radius;




        public Point center = new Point();
        public Circle(double x, double y, double radius){
            center.x = x;
            center.y =y;
            this.radius = radius;
        }

        public double getDistance(Circle circle){
            double distance = Math.sqrt(Math.pow(center.x - circle.center.x, 2) + Math.pow(center.y - circle.center.y, 2));
            return distance;
        }

        public boolean Intersect(Circle circle)
        {
            double distance = Math.sqrt(Math.abs(Math.pow((circle.center.x - center.x),2) + Math.pow(Math.abs(circle.center.y - center.y),2)));
            if(distance <= circle.radius + radius)
            {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Circle circle1 = new Circle(Double.parseDouble(input[0]), Double.parseDouble(input[1]), Double.parseDouble(input[2]));
        input = scanner.nextLine().split(" ");
        Circle circle2 = new Circle(Double.parseDouble(input[0]), Double.parseDouble(input[1]), Double.parseDouble(input[2]));
        if(circle1.Intersect(circle2) == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}