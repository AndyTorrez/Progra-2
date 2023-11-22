class Empleado {
    String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println("Realizando tareas generales como empleado");
    }

    public void recibirPago() {
        System.out.println("Recibiendo salario: $" + salario);
    }
}