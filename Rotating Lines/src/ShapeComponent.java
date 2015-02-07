import java.awt.List;
import java.awt.geom.Point2D;
import java.util.ArrayList;


public class ShapeComponent {

	public ArrayList<Point2D.Double> shape;
	//shape = (r, theta);
	double x1;
	double y1;

	public ShapeComponent(ArrayList<Point2D.Double> shape){
		this.shape=shape;
	}

	public void rotate(double theta){ //theta is in radians

		Point2D.Double Coord2 = null;

		for(int i=0; i < shape.size(); i++){
			double x2 = (shape.get(i).getX() * Math.cos(theta) - (shape.get(i).y * Math.sin(theta)));
			double y2 = (shape.get(i).x * Math.sin(theta) + (shape.get(i).y * Math.cos(theta)));
			Coord2.setLocation(x2,y2);
			shape.set(i,Coord2);
		}
	}

	//
	//	public void rotate2(double degrees) {
	//		for(ShapeComponent c: shape){
	//			c.rotate(degrees);
	//		}

	public static void main(String[][] args){
		Point2D.Double a = new Point2D.Double(0, 1);
		ArrayList<Point2D.Double> b = null;
		b.add(a);
		ShapeComponent test = new ShapeComponent(b);
		test.rotate(Math.PI/2);
		System.out.println(b.toString());
	}
}
