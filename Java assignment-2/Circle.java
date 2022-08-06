//This code is written 21CE042
import java.util.*;
/*Design a class named Circle containing following attributes and
behavior.
• One double data field named radius. The default value is 1.
• A no-argument constructor that creates a default circle.
• A Single argument constructor that creates a Circle with the
specified radius.
• A method named getArea() that returns the area of the
Circle.
• A method named getPerimeter() that returns perimeter of it*/
public class Circle
{
    private double radius;
    public Circle()
    {
        radius=1;
    }
    public Circle(double a)
    {
        radius=a;   
    }
    public double gerperimeter(){
        return radius*3.14*2;
    }
    public double getArea()
    {
        
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        Circle c1=new Circle();
        Circle c2=new Circle(a);
        double area1=c1.getArea();
        double area2=c2.getArea();
        double peri1=c1.gerperimeter();
        double per2=c2.gerperimeter();
        System.out.println("Default Circle's area :"+area1);
        System.out.println("Paramerrized Cicle's area :"+area2);
        System.out.println("Default circle's perimeter :"+peri1);
        System.out.println("Paramerrized Cicle's perimeter  :"+per2);
        s.close();

    }
        
    
}