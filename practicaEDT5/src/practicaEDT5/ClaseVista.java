package practicaEDT5;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
public class ClaseVista extends Frame {
	private static final long serialVersionUID = 1L;
	//Aqu� declaramos los elemntos gr�ficos
	Label etiqueta = new Label("Euros:");
	TextField Euros = new TextField(4);
	Label etiqueta2 = new Label("D�lares:");
	TextField Dolar = new TextField(4);
	Button a = new Button(" Convertir Euros a D�lares ");
	Button b = new Button(" Convertir D�lares a Euros ");
	//Aqu� iniciamos el constructor
	public ClaseVista() {
		setLayout(new GridLayout(3,2));
		setTitle("Conversi�n de divisas");
		add(etiqueta);
		add(etiqueta2);
		add(Euros);
		add(Dolar);
		add(a);
		add(b);
		setSize(450,150);
		setResizable(false);
		setVisible(true);
	}
}
