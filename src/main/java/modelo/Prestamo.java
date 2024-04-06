package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	private BibliotecaDigital biblioteca;
	private ArrayList<RecursoDigital> recursos = new ArrayList<RecursoDigital>();
	private Usuario usuario;

	//metodos getter y setter
	public Date getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Usuario usuario, RecursoDigital recurso) {

		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.usuario = usuario;
		this.recursos.add(recurso);
	}
}