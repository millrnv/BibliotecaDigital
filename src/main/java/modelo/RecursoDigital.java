package modelo;

public class RecursoDigital {
	protected String titulo;
	protected String autor;
	protected int anioPublicacion;
	protected boolean accesoPublico;
	private Clasificacion clasificacion;

	//métodos getter y setter
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return this.anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public boolean getAccesoPublico() {
		return this.accesoPublico;
	}

	public void setAccesoPublico(boolean accesoPublico) {
		this.accesoPublico = accesoPublico;
	}

	public Clasificacion getClasificacion() {
		return this.clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}


	public RecursoDigital(String titulo, boolean acceso, String autor, int anioPublicacion, Clasificacion clasificacion) {

		this.titulo = titulo;
		this.accesoPublico = acceso;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.clasificacion = clasificacion;
	}
}