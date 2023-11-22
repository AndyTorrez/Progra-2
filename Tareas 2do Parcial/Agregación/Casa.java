public class Casa {
    private String direccion;
    private Persona propietario; // Agregación

    public Casa(String direccion, Persona propietario) {
        this.direccion = direccion;
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Casa en " + direccion + "\nPropietario: " + propietario;
    }
}