package es.upm.dit.prog.practica4;

public class SelectorOR implements SelectorLocalizacion {
	
	SelectorLocalizacion s1;
	SelectorLocalizacion s2;
	
	public SelectorOR(SelectorLocalizacion s1, SelectorLocalizacion s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public boolean esValida (Localizacion loc) {
		if(loc==null || s1==null || s2==null) {
			return false;
		}
		if(s1.esValida(loc) || s2.esValida(loc)) {
			return true;
		}
		return false;
	}
	
	
}
