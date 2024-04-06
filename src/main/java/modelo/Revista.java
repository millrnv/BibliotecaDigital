package modelo;

public class Revista extends RecursoDigital {

    public Revista (String titulo,boolean accesoPublico, String autor, int anioPublicacion, Clasificacion clasificacion) {

        super(titulo,accesoPublico ,autor, anioPublicacion, clasificacion);
    }

}