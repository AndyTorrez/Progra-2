class Gerente extends Empleado {
    String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void realizarRevision() {
        System.out.println("Realizando revisiones en el departamento: " + departamento);
    }
}
