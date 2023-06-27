package modelo;

public class Usuario {
	private String nombre;
	private String contraseña;
	private int saldo;
	private int tiradas;
	
	public Usuario() {
		
	}
	
	

	public Usuario(String nombre, String contraseña, int saldo, int tiradas) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.saldo = saldo;
		this.tiradas = tiradas;
	}



	public int getTiradas() {
		return tiradas;
	}



	public void setTiradas(int tiradas) {
		this.tiradas = tiradas;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contraseña=" + contraseña + ", saldo=" + saldo + ", tiradas=" + tiradas
				+ "]";
	}

	

	


	

	
	
	
}
