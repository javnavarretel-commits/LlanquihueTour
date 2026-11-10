package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {

    public static void main(String[] args) {

        Direccion direccion1 = new Direccion(
                "Av. Vicuña Mackenna",
                "150",
                "Llanquihue",
                "Los Lagos"
        );

        Persona persona1 = new Persona(
                "Javier Navarrete",
                "12345678-9",
                "javier@email.com",
                "912345678",
                direccion1
        );

        Empleado empleado1 = new Empleado(
                "Carlos Perez",
                "98765432-1",
                "carlos@email.com",
                "987654321",
                direccion1,
                "Guia turistico",
                750000
        );

        System.out.println("=========================");
        System.out.println("       LLANQUIHUE TOUR");
        System.out.println("==========================");

        System.out.println("\n--- DIRECCION ---");
        System.out.println(direccion1);

        System.out.println("\n--- PERSONA ---");
        System.out.println(persona1);

        System.out.println("\n--- EMPLEADO ---");
        System.out.println(empleado1);

        System.out.println("\n==========================");
        System.out.println("     FIN DEL PROGRAMA");
        System.out.println("==========================");
    }

}
