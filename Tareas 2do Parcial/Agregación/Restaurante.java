public class Restaurante {
    private String nombre;
    private Mesa mesa; // Agregación

    public Restaurante(String nombre, Mesa mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Restaurante: " + nombre + "\nMesa: " + mesa;
    }
}