
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
	public int getVida() {
		return this.vida;
	}
	
	public void setnombreUsuario(String nombreUsuario) {
		this.nombreUsuario=nombreUsuario;
	}
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	private void bucleHobby() {
		for(int i=0;i<1000;i++) {
			System.out.println(nombreHobby);
		}
		
	}
}
