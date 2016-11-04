public class users {

	private String usuario;
	private String password;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public users(String nuevoUsuario, String nuevaPassword){

		usuario=nuevoUsuario;
		password=nuevaPassword;


	}


}
