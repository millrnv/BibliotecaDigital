package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	private BibliotecaDigital biblioteca;
	private ArrayList<RecursoDigital> recursos = new ArrayList<RecursoDigital>();
	private Usuario usuario;

	//metodos getter y setter
	public LocalDate getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public ArrayList<RecursoDigital> getRecursos() {
		return recursos;
	}

	public void setRecursos(ArrayList<RecursoDigital> recursos) {
		this.recursos = recursos;
	}

	public LocalDate getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, Usuario usuario, RecursoDigital recurso) {

		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.usuario = usuario;
		this.recursos.add(recurso);
	}
}