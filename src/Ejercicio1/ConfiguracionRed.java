package Ejercicio1;

public class ConfiguracionRed {

    private static ConfiguracionRed instancia; // única instancia

    private String nombreServidor;
    private int puerto;

    // constructor privado (CLAVE del Singleton)
    private ConfiguracionRed() {
    }

    // método para obtener la única instancia
    public static ConfiguracionRed getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionRed();
        }
        return instancia;
    }

    // getters y setters
    public String getNombreServidor() {
        return nombreServidor;
    }

    public void setNombreServidor(String nombreServidor) {
        this.nombreServidor = nombreServidor;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
}



