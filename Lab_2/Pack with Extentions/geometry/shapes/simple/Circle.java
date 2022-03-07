package geometry.shapes.simple;
import exceptions.CircleException;
import geometry.shapes.Figure;

public class Circle implements Figure{
    private double r;

        
        public Circle(double new_r) throws CircleException{
			if(new_r > 0){
           r = new_r;
      }
      else {
        throw new CircleException("Wrong radius");
      }


        }
		private Circle(double new_r, boolean check){
			r = new_r;
		}

   
        public double CalcSpace(){
          return Math.PI * (r * r);
        }


        public Figure  Clone(){
           return new Circle(r,true);
        }

        /*public void Set_R(double new_r){
          r = new_r;
        }*/
        public double Get_R(){
            return r;
        }
    
      }