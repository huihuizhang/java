package testtriangle;
import java.util.Scanner;
import ex_3.GeometricObject;
class Triangle extends GeometricObject{
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;
    Triangle(){
        super();
    }
    
    Triangle(double a,double b,double c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double getArea(){
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
    
    @Override
    public double getPerimeter(){
        return a + b + c;
    }
    
    @Override
    public String toString() {
	return "Triangle: side1 = " + a + "\tside2 = " + b + "\tside3 = " + c;
    }
}

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("输入三角形的三条边");
        Triangle tri = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
        System.out.println(tri.toString());
        System.out.println("设置color");
        tri.setColor(input.next());
        System.out.println("设置filled");      
        tri.setFilled(input.nextBoolean());
        System.out.println("颜色："+tri.getColor()+"\tisfilled?"+tri.isFilled());
        System.out.println("面积"+tri.getArea()+"\t周长"+tri.getPerimeter());
    } 
}

package ex_3;
public abstract class GeometricObject {
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;

	  /** Construct a default geometric object */
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }

	  /** Construct a geometric object with color and filled value */
	  protected GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }

	  /** Return color */
	  public String getColor() {
	    return color;
	  }

	  /** Set a new color */
	  public void setColor(String color) {
	    this.color = color;
	  }

	  /** Return filled. Since filled is boolean,
	   *  the get method is named isFilled */
	  public boolean isFilled() {
	    return filled;
	  }

	  /** Set a new filled */
	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }

	  /** Get dateCreated */
	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }

	  @Override
	  public String toString() {
	    return "created on " + dateCreated + "\ncolor: " + color +
	      " and filled: " + filled;
	  }

	  /** Abstract method getArea */
	  public abstract double getArea();

	  /** Abstract method getPerimeter */
	  public abstract double getPerimeter();
	}
