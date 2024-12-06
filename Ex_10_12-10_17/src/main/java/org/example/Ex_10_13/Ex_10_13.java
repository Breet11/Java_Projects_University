package org.example.Ex_10_13;

public class Ex_10_13
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle( 4, 6);
        shapes[2] = new Triangle(10);
        shapes[3] = new Sphere(3);
        shapes[4] = new Cube(2);
        shapes[5] = new Tetrahedron(10);

        for(Shape shape: shapes)
        {
            System.out.println(shape.getDescription());

            if(shape instanceof TwoDimensionalShape)
            {
                System.out.printf("Area: %.2f\n",((TwoDimensionalShape) shape).getArea());
            } else if(shape instanceof ThreeDimensionalShape)
            {
                System.out.printf("Area: %.2f\n", ((ThreeDimensionalShape) shape).getArea());
                System.out.printf("Volume: %.2f\n", ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
