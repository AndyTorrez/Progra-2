public class Dueño {
    private String nombre;
    private Perro perro; // Agregación

    public Dueño(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Dueño: " + nombre + "\nMascota: " + perro;
    }
}