package Geometry.D.Triangle.Circle;
public class Circle implements Geometry.D.Figure{
    private double r;

        
        public Circle(double new_r)
        {
           r = new_r;
        }

   
        public double CalcSpace(){
          return Math.PI * (r * r);
        }


        public Geometry.D.Figure  Clone(){
           return new Circle(r);
        }

        /*public void Set_R(double new_r){
          r = new_r;
        }*/
        public double Get_R(){
            return r;
        }
    
      }