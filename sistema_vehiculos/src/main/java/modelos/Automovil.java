package modelos;

public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String marca, int year, int numeroPuertas) {
        super(marca, year);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }

}
