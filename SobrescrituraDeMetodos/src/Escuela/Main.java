package Escuela;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona e1 = new Estudiante();
        Persona profe1 = new Profesor();

        p1.presentarse();
        e1.presentarse();
        profe1.presentarse();
    }

}
