
package app;

import model.Direccion;
import model.Persona;
import model.Empleado;
import service.PersonaService;
import util.ArchivoUtil;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("      LLANQUIHUE TOUR");
        System.out.println("==========================");

        Direccion direccion = new Direccion(
                "Av. Vicuña Mackenna",
                "150",
                "Llanquihue",
                "Los Lagos"
        );

        Persona persona = new Persona(
                "Javier Navarrete",
                "12345678-9",
                "javier@email.com",
                "912345678",
                direccion
        );

        Empleado empleado = new Empleado(
                "Carlos Perez",
                "98765432-1",
                "carlos@email.com",
                "987654321",
                direccion,
                "Guia turistico",
                750000
        );

        System.out.println("\n--- DIRECCION ---");
        System.out.println(direccion);

        System.out.println("\n--- PERSONA ---");
        System.out.println(persona);

        System.out.println("\n--- EMPLEADO ---");
        System.out.println(empleado);

        System.out.println("\n==========================");
        System.out.println("     FIN DEL PROGRAMA");
        System.out.println("==========================");

        ArchivoUtil archivo = new ArchivoUtil();

        System.out.println("\n--- CONTENIDO DEL ARCHIVO ---");
        archivo.leerArchivo("datos/personas.txt");

        System.out.println("\n--- PERSONAS CARGADAS EN LA LISTA ---");

        ArrayList<Persona> personas =
                archivo.cargarPersonas("datos/personas.txt");

        PersonaService servicio = new PersonaService();

        for (Persona p : personas) {
            servicio.agregarPersona(p);
        }

        servicio.mostrarPersonas();

        System.out.println("\n--- PRUEBA DE RUT DUPLICADO ---");

        Persona duplicada = new Persona(
                "Juan Otro",
                "12345678-9",
                "otro@gmail.com",
                "911111111",
                null
        );

        servicio.agregarPersona(duplicada);

        System.out.println("\n--- PRUEBA DE DATOS INCOMPLETOS ---");

        Persona personaIncompleta = new Persona(
                "",
                "",
                "prueba@gmail.com",
                "911111111",
                null
        );

        servicio.agregarPersona(personaIncompleta);

        System.out.println("\n--- BUSQUEDA POR RUT ---");

        Persona encontrada = servicio.buscarPorRut("12345678-9");

        if (encontrada != null) {
            System.out.println("Persona encontrada:");
            System.out.println(encontrada);
        } else {
            System.out.println("No se encontro ninguna persona.");
        }
    }
}
