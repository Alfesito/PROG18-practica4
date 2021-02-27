package es.upm.dit.prog.practica4;

import java.util.Arrays;

public class Registro {
	
	@Override
	public String toString() {
		return "Registro [locs=" + Arrays.toString(locs) + "]";
	}

	Localizacion[]locs;
	
	public Registro (int nm) {
		this.locs=new Localizacion[nm];
	}

	public boolean add(Localizacion l) {
		
		if(l==null) {
			return false;
		}
		for(int n=0;n<locs.length;n++) {
			if(locs[n]==null) {
			locs[n]=l;
			return true;	
			}
		}
		return false;
	}
	
	public Localizacion getLocalizacion(int n) {
		if((n>=0) && (n<locs.length)) {
			return locs[n];
		}
		return null;
	}
	
	/*Localizacion []getLocalizacionesCercanas(Coordenada c, double d){
		if(c==null) {
			return new Localizacion [0];
		}
		int cont=0;
		for(Localizacion lc:locs) {
			if((lc!=null) && (d>=(lc.getC().distancia(c)))) {
			cont++;
			}
		}
		Localizacion [] cercano= new Localizacion [cont];
		int i=0;
		for(Localizacion lc:locs) {
			if((lc!=null) && (d>=(lc.getC().distancia(c)))) {
				cercano[i]=lc;
				i++;
			}
		}
		return cercano;
	}*/
	
	public Localizacion[] getLocalizaciones(SelectorLocalizacion s) {
		if(s==null) {
			return new Localizacion [0];
		}
		int cont=0;
		for(Localizacion lc:locs) {
			if(lc!=null && s.esValida(lc)) cont++;
			
		}
		Localizacion [] array= new Localizacion [cont];
		int i= 0;
		for(Localizacion lc:locs) {
			if(lc!=null && s.esValida(lc)) {
				array[i]=lc;
				i++;
			}
		}
		return array;
	}
	
	
	
}
	

