package main;
import exceptions.CylinderException;
import exceptions.CircleException;
import exceptions.TriangleException;
import geometry.shapes.Figure;
import geometry.shapes.simple.Circle;
import geometry.shapes.simple.Triangle;
import geometry.Cylinder;
class Main {
    public static void main(String[] args) {

      System.out.println("Hello, there");
     try {


       Figure c = new Circle(5);
       Figure t = new Triangle(3, 4, 5);
       Cylinder cyl = new Cylinder(10, c);
       Cylinder tr = new Cylinder(100, t);

       Figure circle = c.Clone();
       Figure triangle = t.Clone();
       t = null;
       c = null;


       System.out.println("Space of Circle:");
       System.out.println(circle.CalcSpace());
       System.out.println("Space of Triangle: ");
       System.out.println(triangle.CalcSpace());

       System.out.println("Volume of Circle Cylinder: ");
       System.out.println(cyl.CalcVolume());
       System.out.println("Volume of Triangle Cylinder: ");
       System.out.println(tr.CalcVolume());



     }

     catch(TriangleException ex){
       System.out.println(ex.getMessage());
     }
     catch (CircleException ex) {
         System.out.println(ex.getMessage());
     }

     catch (CylinderException ex) {
         System.out.println(ex.getMessage());
     }



     }

      //Figure a =t.Clone();
      //System.out.println(a.CalcSpace());


      }
