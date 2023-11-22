class Motocicleta extends Transporte {
    boolean tieneSidecar;

    public Motocicleta(String marca, boolean tieneSidecar) {
        super(marca);
        this.tieneSidecar = tieneSidecar;
    }

    public void ponerCasco() {
        System.out.println("Poniendo el casco para andar en motocicleta");
    }
}