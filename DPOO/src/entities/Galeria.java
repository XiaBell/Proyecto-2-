package entities;

import java.util.ArrayList;
import java.util.Hashtable;

import logic.Cashier;
import logic.Comprador;
import logic.Empleado;
import logic.Operador;
import logic.admin;

public class Galeria {
	
	private static Inventario inventario;
	private static ArrayList<Subasta> subastas = new ArrayList<Subasta>();
	private static admin administrador;
	private static Hashtable<String, Cashier> cajeros = new Hashtable<>();
	private static Hashtable<String, Operador> operadores = new Hashtable<>();
	private static Hashtable<String, Comprador> compradores = new Hashtable<>();
	private static Hashtable<String, Comprador> propietarios = new Hashtable<>();
	
	
	
	public static ArrayList<Subasta> subastas(){
		return subastas;
	    }
	
	public static void setcajero(String usuario, Cashier cajero) {
		
	   cajeros.put(usuario, cajero);
			
		}
		
    public static void setoperador(String usuario,Operador operador) {
			
			operadores.put(usuario, operador);
		}

    public static void setcomprador(String usuario,Comprador comprador) {
	
    	
    	compradores.put(usuario, comprador);
       }

    public static void setpropietario(String usuario,Comprador propietario) {
	
    	propietarios.put(usuario, propietario);
	
       }

    public static void setadmin(admin admin) {
    	
    	administrador = admin;
      }	
    
    public static Comprador buscarcomprador(String usuario) {
    	
    	return compradores.get(usuario);
    	
    }
    
    public static Cashier buscarcajero(String usuario) {
    	
    	return cajeros.get(usuario);
    	
    }
    
    public static Operador buscaroperador(String usuario) {
    	
    	return operadores.get(usuario);
    	
    }
    
    public static Comprador buscarpropietario(String usuario) {
    	
    	return propietarios.get(usuario);
    	
    }
    
    
		
	}

