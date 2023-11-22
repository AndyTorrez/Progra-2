class Coche extends Vehiculo {
    int numeroPuertas;

    public Coche(String marca, int numeroPuertas) {
        super(marca);
        this.numeroPuertas = numeroPuertas;
    }

    public void conducir() {
        System.out.println("Conduciendo el coche");
    }
}