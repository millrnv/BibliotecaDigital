package modelo;

public class Profesor extends Usuario {

	public Profesor(String nombreUsuario, String id, int nTelefono, String correo) {
		super(nombreUsuario, id, nTelefono, correo);
	}

	public String getTipo() {
		return "Profesor";
	}

	@Override
	public String toString() {
		return "Profesor [nombreUsuario=" + nombreUsuario + ", id=" + id + ", nTelefono=" + nTelefono + ", correo="
				+ correo + "]";
	}

}