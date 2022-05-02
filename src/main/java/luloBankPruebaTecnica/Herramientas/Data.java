package luloBankPruebaTecnica.Herramientas;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Data {

    private final Properties prop = new Properties();
    private final InputStream in = Data.class.getResourceAsStream("/endpoint.properties");

    private static final Map<String, String> sceneryData = new HashMap<>();


    public String leerPropiedades(String property) throws IOException {
        prop.load(in);
        return prop.getProperty(property);
    }

    public void datosPrueba(String parameter) throws IOException {
        guardarDatos(parameter, leerPropiedades(parameter));
    }

    public void guardarDatos(String key, String text) {
        if (!sceneryData.containsKey(key)) {
            sceneryData.put(key, text);
        } else {
            sceneryData.replace(key, text);
        }
    }
    public String obtenerDatos(String key) {
        boolean exist = sceneryData.containsKey(key);
        String text = "";
        if (exist) {
            text = sceneryData.get(key);
        }else {
            System.out.println("llave no existe");
        }
        return text;
    }
}
