package geometry.shapes.simple;
import exceptions.TriangleException;
import geometry.shapes.Figure;

public class Triangle implements Figure{

    private double A;
    private double B;
    private double C;
   

    private boolean TestMySides(double a ,double b , double c){
       if ( c<=a+b && a<=b+c && b<=c+a && a > 0 && b > 0 && c > 0){
        return true;
        }
    else{
        return false;
        }   
    }
    private double CalcPer(){
       return (A + B + C) / 2;
    }

        public Triangle(double a ,double b ,double c ) throws TriangleException {
           if(TestMySides(a,b,c)){
        A=a;
        B=b;
        C=c;}
		 
   else{
     throw new TriangleException("It's impossible triangle");
    }
   }
   
    private Triangle(double a, double b, double c, boolean check){
				 A = a;
				 B = b;
				 C = c;
			}
   
   
   
   
   
        public double CalcSpace(){
           double p = CalcPer();
           
	      return  Math.sqrt(p * (p - A) * (p - B) * (p - C));
         
        }
        public Figure Clone(){
           return new Triangle(A,B,C,true);

        }

        public void Set_Sides(double a,double b,double c){
          A=a;
          B=b;
          C=c;
        }
        public double Get_A(){
           return A;
        }
        public double Get_B(){
           return B;
        }
        public double Get_C(){
           return C;
        }
}