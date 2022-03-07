package geometry;
import exceptions.CylinderException;
import geometry.shapes.Figure;

public class Cylinder{
private double h;
private Figure base;

public Cylinder(double new_h, Figure new_base) throws CylinderException {
   if(new_h > 0) {
      h = new_h;
      base = new_base.Clone();
   }
   else{
      throw new CylinderException("It's impossible cylinder");
   }
}

public double CalcVolume(){
   return h * base.CalcSpace();
}
}