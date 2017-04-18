import java.awt.Graphics;
import java.util.ArrayList;

public class RandomSetPoint {
	private ArrayList<Punto> conjunto;

	public RandomSetPoint(int nPuntos) {
		conjunto = new ArrayList<Punto>();
		for(int i = 0; i < nPuntos; i++) {
			boolean set = false;
			while(!set) {
				Punto puntoAuxiliar = new Punto((int)(Math.random() * 30), (int)(Math.random() * 30));
				if(!isSet(puntoAuxiliar)) {
					set = true;
					conjunto.add(puntoAuxiliar);
				}
			}
		}
	}
	public void drawAllPoints(Graphics graphicObject, int spacing) {
		for(Punto i: getConjunto()) 
			i.drawPoint(graphicObject, spacing);
	}
	public ArrayList<Punto> getConjunto() {
		return conjunto;
	}

	public void setConjunto(ArrayList<Punto> conjunto) {
		this.conjunto = conjunto;
	}
	public boolean isSet(Punto punto) {
		for(Punto i: getConjunto()) {
			if(i.getXAxis() == punto.getXAxis() && i.getYAxis() == punto.getYAxis()) return true;
		}
		return false;
	}
	
}
