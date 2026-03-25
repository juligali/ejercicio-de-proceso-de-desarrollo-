package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String sistema = "Windows";

        if (sistema.equalsIgnoreCase("Windows")){
            factory = new WindowsFactory();
        }else{
            factory = new MacFactory();
        }

        Boton boton = factory.crearBoton();
        Checkbox checkbox = factory.CrearCheckbox();

        boton.mostrar();
        checkbox.mostar();
    }
}
