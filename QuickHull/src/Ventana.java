import javax.swing.*;

public class Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	private final int BORDES = 20;
	
	public Ventana() {
		super();
		((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(BORDES, BORDES, BORDES, BORDES));
		add(new PanelGrafico());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ventana();
	}
}