/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author User
 */
public class Decorator {
public static void main(String[] args) {

Shape circle = new Circle();
        double circlePrice = circle.getPrice();

        Shape redCircle = new RedShapeDecorator(new Circle());
        double redCirclePrice = redCircle.getPrice();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        double redRectanglePrice = redRectangle.getPrice();

        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Cost: $" + circlePrice);

        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("Cost: $" + redCirclePrice);

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        System.out.println("Cost: $" + redRectanglePrice);
        }

    
}
