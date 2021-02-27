package es.upm.dit.prog.practica4;

public class SelectorWiFi implements SelectorLocalizacion {
	
	WiFi red;
	double umbral;
	
	public SelectorWiFi(WiFi red, double umbral) {
		this.red = red;
		this.umbral = umbral;
	}
	
	public boolean esValida(Localizacion loc) {
		if(loc==null || red==null ) {
			return false;
		}
		Lectura [] lc= loc.copiaDeLecturas();
		
		for(int n=0; n<lc.length; n++) {
			if(lc[n].getPotencia()>=umbral && red.equals(lc[n].getRed())) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
}
