package modelo;

public class Estudiante extends Usuario {

	//constructor de la clase padre
	public Estudiante(String nombreUsuario, String id, int nTelefono, String correo) {
		super(nombreUsuario, id, nTelefono, correo);
	}

	public String getTipo() {
		return "Estudiante";
	}

	@Override
	public String toString() {
		return "Estudiante [nombreUsuario=" + nombreUsuario + ", id=" + id + ", nTelefono=" + nTelefono + ", correo="
				+ correo + "]";
	}

}