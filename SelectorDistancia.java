package es.upm.dit.prog.practica4;

public class SelectorDistancia implements SelectorLocalizacion {

	Coordenada c;
	double d;
	
	public SelectorDistancia(Coordenada c, double d) {
		this.c = c;
		this.d = d;
	}

	public boolean esValida(Localizacion loc) {
		if(loc!=null && c !=null && loc.getC().distancia(c)<=d) {
			return true;
		}
		return false;
	}


}
