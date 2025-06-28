package modelos;

public class Gerente extends empleados{
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Bono adicional: $" + bono);
        System.out.println("Salario total: $" + (getSalario() + bono));
    }
}
