class Carro extends Transporte {
    int numeroPuertas;

    public Carro(String marca, int numeroPuertas) {
        super(marca);
        this.numeroPuertas = numeroPuertas;
    }

    public void abrirPuertas() {
        System.out.println("Abriendo las " + numeroPuertas + " puertas del coche");
    }
}
