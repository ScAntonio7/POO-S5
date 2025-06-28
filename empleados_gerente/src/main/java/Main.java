import modelos.Gerente;
import modelos.empleados;

public class Main {
    public static void main(String[] args) {
    empleados emp1 = new empleados("Zamir Sevilla", 500.00);
    Gerente gerente1 = new Gerente("Zoila Ponce", 1000.00, 300.00);

        System.out.println("=== Información del Empleado ===");
        emp1.mostrarInformacion();

        System.out.println("\n=== Información del Gerente ===");
        gerente1.mostrarInformacion();
}
}





