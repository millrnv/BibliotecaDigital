package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Prestamo;

public class BibliotecaDigital {
	private String nombreBiblioteca;
	private ArrayList<RecursoDigital> recursos = new ArrayList<RecursoDigital>();
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();


	//metodos getter y setter
	public String getNombreBiblioteca() {
		return this.nombreBiblioteca;
	}

	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}


	//metodos de la clase
	public void realizarPrestamo(Usuario usuario, RecursoDigital recurso) {
		if (usuario instanceof Profesor || recurso.getAccesoPublico()) {
			Prestamo nuevoPrestamo = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(7), usuario, recurso);
			this.prestamos.add(nuevoPrestamo);
			System.out.println("Préstamo realizado con éxito.");
		} else {
			System.out.println("Este recurso es privado y solo está disponible para profesores.");
		}

	}

	public void devolverRecurso(Prestamo prestamo) {
		prestamos.remove(prestamo);
	}

	public void extenderPlazo(LocalDate nfechaDevolucion, Prestamo prestamo) {
		for (Prestamo prestamoRegistrado : prestamos) {
			if (prestamoRegistrado.equals(prestamo)) {
				prestamoRegistrado.setFechaDevolucion(nfechaDevolucion);
			}
		}
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

	public List<RecursoDigital> buscarRecursoPorClasificacion(Clasificacion clasificacion) {
		List<RecursoDigital> recursosPorClasificacion = new ArrayList<RecursoDigital>();
		for (RecursoDigital recurso : recursos) {
			if (recurso.getClasificacion().equals(clasificacion)) {
				recursosPorClasificacion.add(recurso);
			}
		}
		return recursosPorClasificacion;

	}


	public void enviarNotificacionDevolucion(Prestamo prestamo) {
		for (Prestamo prestamoRegistrado : prestamos) {
			if (prestamoRegistrado.equals(prestamo)) {
				Usuario usuario = prestamoRegistrado.getUsuario();
				usuario.recibirNotificacionDevolucion();
			}
		}
	}


	public void agregarRecursoDigital(RecursoDigital recursoDigital) {
		recursos.add(recursoDigital);

	}

	public void eliminarRecursoDigital(RecursoDigital recursoDigital) {
		recursos.remove(recursoDigital);
	}


	public void darRecomendacion(Usuario usuario) {

	}




	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void eliminarUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}

}