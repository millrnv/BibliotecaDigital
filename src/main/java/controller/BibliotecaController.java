package controller;


import modelo.*;

public class BibliotecaController {

    public static void inicializar() {

        //Crear biblioteca
        BibliotecaDigital biblioteca = new BibliotecaDigital();

        //Crear estudiantes cualesquiera
        Estudiante estudiante1 = new Estudiante("Juan", "123", 1234567, "juan@ufrontera.cl");
        Estudiante estudiante2 = new Estudiante("Maria", "456", 7654321, "maria@ufrontera.cl");

        //Crear profesores cualesquiera
        Profesor profesor1 = new Profesor("Pedro", "789", 9876543, "pedro@ufro.cl");
        Profesor profesor2 = new Profesor("Ana", "101", 1010101, "ana@ufro.cl");


    }


    public static void main(String[] args) {

        inicializar();



    }
}