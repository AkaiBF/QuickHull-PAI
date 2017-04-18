import java.awt.Color;
import java.awt.Graphics;

public class Punto {
	protected final static int RADIUS = 3;
	
	private int xAxis;
	private int yAxis;
	
	public Punto() {
		xAxis = 0;
		yAxis = 0;
	}
	public Punto(int xAxis, int yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}
	public int getXAxis() {
		return xAxis;
	}
	public int getYAxis() {
		return yAxis;
	}
	public void setXAxis(int xAxis) {
		this.xAxis = xAxis;
	}
	public void setYAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public void drawPoint(Graphics graphicObject, int spacing) {
		graphicObject.setColor(Color.RED);
		graphicObject.drawOval(getXAxis() * spacing - RADIUS, getYAxis() * spacing - RADIUS, RADIUS * 2, RADIUS * 2);
	}
	public String toString() {
		return (new String("(" + getXAxis() + ", " + getYAxis() + ")"));
	}
}
