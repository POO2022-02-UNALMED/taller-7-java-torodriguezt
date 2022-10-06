package comunicacion;

public class Alfabeto extends Pictograma {
	private static String[] letras = new String[26];
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		for (int i=0; i<letras.length; i++) {
			System.out.print(letras[i]);
		}
	}
}