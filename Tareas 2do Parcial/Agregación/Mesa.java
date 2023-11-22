public class Mesa {
    private int numero;

    public Mesa(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Mesa #" + numero;
    }
}