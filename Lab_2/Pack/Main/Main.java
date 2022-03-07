package Main;
import Geometry.D.Figure;
class Main {
    public static void main(String[] args) {

      System.out.println("Hello, there");
      

      
      Figure c = new Geometry.D.Triangle.Circle.Circle(5);
      Figure t = new Geometry.D.Triangle.Triangle(3,4,5);
      Geometry.Cylinder cyl =  new Geometry.Cylinder(10,c);
      Geometry.Cylinder tr =  new Geometry.Cylinder(100,t);


      //Figure a =t.Clone();
      //System.out.println(a.CalcSpace());

   
       System.out.println("Space of Circle: ");
      System.out.println(c.CalcSpace());
      System.out.println("Space of Triangle: ");
      System.out.println(t.CalcSpace());

      System.out.println("Volume of Circle Cylinder: ");
      System.out.println(cyl.CalcVolume());
      System.out.println("Volume of Triangle Cylinder: ");
      System.out.println(tr.CalcVolume());
      
     


      }
    }