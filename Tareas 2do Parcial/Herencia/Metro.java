class Metro extends Tren {
    private String linea;

    public Metro(String modelo, int capacidadPasajeros, String linea) {
        super(modelo, capacidadPasajeros);
        this.linea = linea;
    }

    public void anunciarEstacion(String estacion) {
        System.out.println("Próxima estación: " + estacion);
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Línea: " + linea);
    }
}