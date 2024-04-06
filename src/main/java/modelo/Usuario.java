package modelo;

public abstract class Usuario {
	protected String nombreUsuario;
	protected String id;
	protected int nTelefono;
	protected String correo;


	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNTelefono() {
		return this.nTelefono;
	}

	public void setNTelefono(int nTelefono) {
		this.nTelefono = nTelefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	//?????
	public void recibirNotificacionDevolucion(){
		System.out.println("Notificación de devolución enviada a: " + this.nombreUsuario);

	}

	public Usuario(String nombreUsuario, String id, int nTelefono, String correo) {
		this.nombreUsuario = nombreUsuario;
		this.id = id;
		this.nTelefono = nTelefono;
		this.correo = correo;
	}


	public abstract String getTipo();

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", id=" + id + ", nTelefono=" + nTelefono + ", correo="
				+ correo + "]";
	}
}