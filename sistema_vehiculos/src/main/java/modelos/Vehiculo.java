package modelos;

public class Vehiculo {
    private String marca;
    private int year;


    public Vehiculo(String marca, int year) {
        this.marca = marca;
        this.year = year;

    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Year: " + year);
    }
}


