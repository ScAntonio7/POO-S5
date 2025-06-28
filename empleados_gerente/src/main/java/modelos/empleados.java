package modelos;

public class empleados {
        private String nombre;
        private double salario;

        public empleados(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }

        public void mostrarInformacion() {
            System.out.println("Empleado: " + nombre);
            System.out.println("Salario base: $" + salario);
        }


}
