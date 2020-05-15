package practicaEDT5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class ClaseControlador implements ActionListener, WindowListener {
	ClaseVista objVista = null;
	ClaseModelo objModelo = null;
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo;
		objVista.a.addActionListener(this);
		objVista.b.addActionListener(this);
		objVista.addWindowListener(this);
	}
	public void actionPerformed(ActionEvent evento) 
	{
		if(objVista.a.equals(evento.getSource())) {
			try {
				float MonedaEuro = (Float.parseFloat
						(this.objVista.Euros.getText()));
				float resultadoDolar = (float) objModelo.Eur(MonedaEuro);
				objVista.Dolar.setText(""+resultadoDolar);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				float MonedaDolar =(Float.parseFloat
						(this.objVista.Dolar.getText()));
				float ResultadoEuro = objModelo.Dol(MonedaDolar);
				objVista.Euros.setText(""+ResultadoEuro);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void windowActivated(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
}
