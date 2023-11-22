class Tren {
    private String modelo;
    private int capacidadPasajeros;

    public Tren(String modelo, int capacidadPasajeros) {
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void iniciarViaje() {
        System.out.println("El tren ha iniciado su viaje.");
    }

    public void detenerViaje() {
        System.out.println("El tren ha detenido su viaje.");
    }

    public void imprimirInformacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
    }
}