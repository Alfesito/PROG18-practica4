package es.upm.dit.prog.practica4;

public class SelectorTrue implements SelectorLocalizacion {

	public boolean esValida (Localizacion loc) {
		if(loc==null) {
			return false;
		}
		return true;
	}
	
}
