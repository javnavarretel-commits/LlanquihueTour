
package service;

import model.Persona;
import java.util.ArrayList;

public class PersonaService {

    private ArrayList<Persona> personas;

    public PersonaService() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {

        if (persona == null ||
                persona.getNombre() == null ||
                persona.getNombre().trim().isEmpty() ||
                persona.getRut() == null ||
                persona.getRut().trim().isEmpty()) {

            System.out.println("Error: El nombre y el RUT son obligatorios.");
            return;
        }

        for (Persona existente : personas) {

            if (existente.getRut().equalsIgnoreCase(persona.getRut())) {
                System.out.println("Error: El RUT ya se encuentra registrado.");
                return;
            }
        }

        personas.add(persona);
        System.out.println("Persona agregada correctamente.");
    }

    public void mostrarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public Persona buscarPorRut(String rut) {
        for (Persona persona : personas) {
            if (persona.getRut().equalsIgnoreCase(rut)) {
                return persona;
            }
        }
        return null;
    }
}
