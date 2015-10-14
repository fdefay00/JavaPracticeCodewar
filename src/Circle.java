import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * Description:
Complete the function circleArea so that it will return the area of a circle with the given radius. 
Round the returned number to two decimal places (except for Haskell). If the radius is not positive 
or not a number, return false.
Example:
Circle.area(-1485.86);    //returns false
Circle.area(0);           //returns false
Circle.area(43.2673);     //returns 5881.25
Circle.area(68);          //returns 14526.72
*/
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Circle.area(2));
	}
	
	public static double area(double radius) {
    	NumberFormat df = new DecimalFormat("#0.00");
    	if(radius < 0 || !isDouble(radius))
    		return 0D;
    	double area = (Math.PI)*radius*radius;
    	return  Double.parseDouble(df.format(area));
    }
	
    public static boolean isDouble(Object obj){
    	return obj instanceof Double ? true: false;
    }
    
    /******BestPractice******/
    public static double area1(double radius) {
        if (radius <= 0.0 || radius == Double.NaN) {
          throw new IllegalArgumentException();
        }
        return Math.round(Math.PI*(radius*radius) * 100.0) / 100.0;
      }
    
    /******BestPractice******/
      public static double area2(double radius) {
        if(radius <= 0D) {throw new IllegalArgumentException("Radius must be > 0");}
        return (new BigDecimal(Math.PI * radius * radius)).setScale(2, RoundingMode.HALF_UP).doubleValue();
      }

}
