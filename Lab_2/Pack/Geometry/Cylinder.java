package Geometry;

public class Cylinder{
private double h;
private Geometry.D.Figure base;

public Cylinder(double new_h, Geometry.D.Figure new_base){
   h = new_h;
   base = new_base;
}

public double CalcVolume(){
   return h * base.CalcSpace();
}
}