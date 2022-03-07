package exceptions;

public class CircleException extends Exception{
    private double value;

    public double GetValue(){
        return value;

    }    public CircleException(String message){
        super(message); //greating standart Exception(parent class method)
    }

    public CircleException(String message, double a){
        super(message);
        value = a;
    }

}
