package exceptions;


public class TriangleException extends Exception{
    private double A;
    private double B;
    private  double C;


    public TriangleException(String message){
        super(message); //greating standart Exception(parent class method)
    }



    public TriangleException(String message, double a, double b, double c){
        super(message); //greating standart Exception(parent class method)
        A = a;
        B = b;
        C = c;

    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }





}