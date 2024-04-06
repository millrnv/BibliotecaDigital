package modelo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDigital {
	private String nombreBiblioteca;
	private ArrayList<RecursoDigital> recursos = new ArrayList<RecursoDigital>();
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

	//metodos getter y setter
	public String getNombreBiblioteca() {
		return this.nombreBiblioteca;
	}

	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}

	//metodos de la clase
	public void realizarPrestamo() {
		throw new UnsupportedOperationException();
	}

	public void devolverRecurso() {
		throw new UnsupportedOperationException();
	}

	public void extenderPlazo(String plazoExtra, Prestamo prestamo) {
		throw new UnsupportedOperationException();
	}

	public List<RecursoDigital> buscarRecursoPorAutor(String autor) {
		List<RecursoDigital> recursosPorAutor = new ArrayList<RecursoDigital>();
		for (RecursoDigital recurso : recursos) {
			if (recurso.getAutor().equals(autor)) {
				recursosPorAutor.add(recurso);
			}
		}
		return recursosPorAutor;
	}

	public RecursoDigital buscarRecursoPorTitulo(String titulo) {
		for (RecursoDigital recurso : recursos) {
			if (recurso.getTitulo().equals(titulo)) {
				return recurso;
			}
		}
		return null;
	}

	public List<RecursoDigital> buscarRecursoPorAnio(int anio) {
		List<RecursoDigital> recursosPorAnio = new ArrayList<RecursoDigital>();
		for (RecursoDigital recurso : recursos) {
			if (recurso.getAnioPublicacion() == anio) {
				recursosPorAnio.add(recurso);
			}
		}
		return recursosPorAnio;
	}

	//falta este metodo
	public List<RecursoDigital> buscarRecursoPorClasificacion() {
		throw new UnsupportedOperationException();
	}


	public void enviarNotificacion() {
		throw new UnsupportedOperationException();
	}


	public void agregarRecursoDigital(RecursoDigital recursoDigital) {
		recursos.add(recursoDigital);

	}

	public void eliminarRecursoDigital(RecursoDigital recursoDigital) {
		recursos.remove(recursoDigital);
	}


	public void darRecomendacion() {
		throw new UnsupportedOperationException();
	}
}