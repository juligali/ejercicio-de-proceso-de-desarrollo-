package Ejercicio3;

public class WindowsFactory implements GUIFactory{
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Checkbox CrearCheckbox() {
        return new CheckboxWindows();
    }
}
