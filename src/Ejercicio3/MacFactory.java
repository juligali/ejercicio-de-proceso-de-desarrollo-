package Ejercicio3;

public class MacFactory implements GUIFactory{
    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public Checkbox CrearCheckbox() {
        return new CheckboxMac();
    }
}
