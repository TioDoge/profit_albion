
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class ConsumirApi {
    public static void main(String[] args) {
        
    }
    
    public static String peticionHttpGet(String urlParaVisitar) throws Exception {
    // Esto es lo que vamos a devolver
    StringBuilder resultado = new StringBuilder();
    // Crear un objeto de tipo URL
    URL url = new URL(urlParaVisitar);

    // Abrir la conexión e indicar que será de tipo GET
    HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
    conexion.setRequestMethod("GET");
    // Búferes para leer
    BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
    String linea;
    // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
    while ((linea = rd.readLine()) != null) {
      resultado.append(linea);
    }
    // Cerrar el BufferedReader
    rd.close();
    // Regresar resultado, pero como cadena, no como StringBuilder
    return resultado.toString();
  }
}
