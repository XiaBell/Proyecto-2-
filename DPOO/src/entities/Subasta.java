package entities;

import logic.Operador;

import java.util.ArrayList;

import logic.Comprador;

public class Subasta {
	
	private Operador operador;
	private int min_valorpieza;
	private ArrayList<Comprador> participantes;
	private String fechainicio;
	private String fechafin;
	private boolean activo;
	private ArrayList<Oferta> ofertas;
	private ArrayList <Pieza> piezas;
	private int codigo;
	
	public void codigo_unico() {
		
		 int codigoGenerado = Math.abs(operador.hashCode() + min_valorpieza + participantes.hashCode() +
	                fechainicio.hashCode() + fechafin.hashCode() + (activo ? 1 : 0) + ofertas.hashCode() +
	                piezas.hashCode());
		 
		 boolean continuar = true;
		 ArrayList<Subasta> subastas = Galeria.subastas();
		 
		 while(continuar) {
			 
			 if (codigoExiste(codigoGenerado, subastas)) {
				 codigoGenerado = (int) (Math.random() * 10000); // Genera un código aleatorio entre 0 y 9999
				    }
				 
			 else{
				 this.codigo = codigoGenerado;
				 continuar = false;
			 }
		 }
	}
		 
public int getCodigo() {
	
	return this.codigo;
}
	
	
         public static boolean codigoExiste(int codigo, ArrayList<Subasta> subastas) {
	        for (Subasta subasta : subastas) {
	            if (subasta.getCodigo() == codigo) {
	                return true; // Código encontrado, retorna true
	            }
	        }
	        return false; // Código no encontrado, retorna false
	    }

}
