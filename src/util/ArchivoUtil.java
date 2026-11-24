
package util;

import model.Persona;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil {

    public void leerArchivo(String ruta) {

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public ArrayList<Persona> cargarPersonas(String ruta) {

        ArrayList<Persona> lista = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(",");

                Persona persona = new Persona(
                        datos[0],
                        datos[1],
                        datos[2],
                        datos[3],
                        null
                );

                lista.add(persona);
            }

        } catch (IOException e) {
            System.out.println("Error al cargar personas: " + e.getMessage());
        }

        return lista;
    }
}
