public class Transporte {
    String marca;
    int velocidad;

    public Transporte(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void acelerar() {
        System.out.println("Acelerando el vehículo");
        velocidad += 10;
    }

    public void frenar() {
        System.out.println("Frenando el vehículo");
        velocidad -= 5;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
}
