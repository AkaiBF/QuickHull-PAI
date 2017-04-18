import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelGrafico extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelGrafico() {
		super();
		setSize(100, 100);
	}
	
	public void paintComponent(Graphics graphicObject) {
		int espaciado = (int)(getSize().getHeight() - 1) / 30;
		for(int i = 0; i <= 30 * espaciado; i += espaciado) {
			graphicObject.drawLine(0, i, 30 * espaciado, i);
			graphicObject.drawLine(i, 0, i, 30 * espaciado);
		}
		RandomSetPoint conjunto = new RandomSetPoint(20);
		conjunto.drawAllPoints(graphicObject, espaciado);
	}

}
