package es.upm.dit.prog.practica4;

public class SelectorAbierta implements SelectorLocalizacion {

	double umbral;

	public SelectorAbierta(double umbral) {
		this.umbral = umbral;
	}
	
	public boolean esValida (Localizacion loc) {
		Lectura [] lc= loc.copiaDeLecturas();
		
		for(int i=0; i<lc.length; i++) {
			if(lc[i]!=null && lc[i].getRed().getSeguridad()==Seguridad.ABIERTA && lc[i].getPotencia()>=umbral) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
