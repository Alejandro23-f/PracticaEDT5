package practicaEDT5;
public class ClaseModelo {
	public double Eur(float MonedaEuro) {
		double ResultadoDolar;
		ResultadoDolar = (MonedaEuro*1.0990);
		return(ResultadoDolar);
	}
	public float Dol(float MonedaDolar) {
		float ResultadoEuro;
		ResultadoEuro = (float) (MonedaDolar*0.9102);
		return(ResultadoEuro);
	}
}