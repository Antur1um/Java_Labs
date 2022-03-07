package exceptions;

public class CylinderException extends Exception{

    private double H;

    public CylinderException(String message) {
        super(message);
    }

    public CylinderException(String message, double height) {
        super(message);
        H = height;
    }

    public double getH() {
        return H;
    }
}
