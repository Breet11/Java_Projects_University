package org.example;

public class Ex_8_4
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        System.out.printf("Default  values of new rectangle object:%nWidth: %.2f%nLength: %.2f%n", rectangle.getWidth(),
                rectangle.getLength());

        rectangle.setLength(10);
        rectangle.setWidth(15.5);

        System.out.printf("The perimeter of rectangle: %.2f%n", rectangle.calcPerimeter());
        System.out.printf("The area of rectangle: %.2f", rectangle.calcArea());
    }
}