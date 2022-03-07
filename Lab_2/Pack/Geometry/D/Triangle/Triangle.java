package Geometry.D.Triangle;
public class Triangle implements Geometry.D.Figure{

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

        public Triangle(double a ,double b ,double c ){
           if(TestMySides(a,b,c)){
        A=a;
        B=b;
        C=c;}
        //}

    else{
     return;
    }
   }
   
        public double CalcSpace(){
           double p = CalcPer();
           
	      return  Math.sqrt(p * (p - A) * (p - B) * (p - C));
         
        }
        public Geometry.D.Figure Clone(){
           return new Triangle(A,B,C);

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