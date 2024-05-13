package logic;

public class admin extends Usuario{
	
	private String nombre;
	private String apellido;
	
	
	public admin(String user, String pass, String rol, String actu, String nombre, String apellido) {
		
		super(user, pass, rol, actu);
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public String getnombre() {
		return nombre;
	}

}
