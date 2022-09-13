
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert the value for width");

        System.out.println("Please insert the value for length");
        System.out.println("Please insert the value for x");
        System.out.println("Please insert the value for y");


        Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());


        System.out.println("The area of the rectangle is " +r1.calculateArea(r1.width, r1.length));

        System.out.println("The perimetern is "+ r1.calculatePerimeter(r1.width, r1.length));

         r1= new Rectangle();

         System.out.println(r1.length);


    }
}