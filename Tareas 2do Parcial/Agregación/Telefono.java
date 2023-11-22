public class Telefono {
    private String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Teléfono: " + numero;
    }
}