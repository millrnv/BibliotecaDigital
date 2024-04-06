package modelo;

public class RecursoDigital {
	protected String titulo;
	protected String autor;
	protected int anioPublicacion;
	protected String[] clasificacion;
	private Prestamo prestamo;

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

	public String[] getClasificacion() {
		return this.clasificacion;
	}

	public void setClasificacion(String[] clasificacion) {
		this.clasificacion = clasificacion;
	}

	public RecursoDigital(String titulo, String autor, int anioPublicacion, String[] clasificacion) {

		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.clasificacion = clasificacion;
	}
}