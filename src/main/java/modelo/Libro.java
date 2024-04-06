package modelo;

public class Libro extends RecursoDigital {

    public Libro (String titulo, boolean accesoPublico, String autor, int anioPublicacion, Clasificacion clasificacion) {

        super(titulo, accesoPublico,autor, anioPublicacion, clasificacion);
    }


}