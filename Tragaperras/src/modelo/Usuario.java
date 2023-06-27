package modelo;

public class Usuario {
	private String nombre;
	private String contrase�a;
	private int saldo;
	private int tiradas;
	
	public Usuario() {
		
	}
	
	

	public Usuario(String nombre, String contrase�a, int saldo, int tiradas) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contrase�a=" + contrase�a + ", saldo=" + saldo + ", tiradas=" + tiradas
				+ "]";
	}

	

	


	

	
	
	
}
