public class Sujeto {
    private String nombre;
    private Telefono telefono; // Agregación

    public Sujeto(String nombre, Telefono telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona: " + nombre + "\n" + telefono;
    }