import modelos.Automovil;
import modelos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Ferrari", 2025);
        Automovil automovil = new Automovil("Toyota", 2020, 4);

        vehiculo.mostrarInformacion();
        System.out.println("----");
        automovil.mostrarInformacion();
    }
}
