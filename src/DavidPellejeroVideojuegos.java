
public class DavidPellejeroVideojuegos {
	public String nombreHobby;
	public int vida;
	public String nombreUsuario;
	
	public DavidPellejeroVideojuegos(String nombreHobby, int vida, String nombreUsuario) {
		this.nombreHobby = nombreHobby;
		this.vida = vida;
		this.nombreUsuario = nombreUsuario;
	}
	public void setNombreHobby(String nombreHobby) {
		this.nombreHobby=nombreHobby;
	}
	public String getNombreHobby() {
		return this.nombreHobby;
	}
	
	public void setVida(int vida) {
		this.vida=vida;
	}
}
