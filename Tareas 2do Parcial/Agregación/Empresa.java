public class Empresa {
    private Empleado[] empleados;
    public Empresa() {
        empleados = new Empleado[10];
    }
    public void agregarEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                break;
            }
        }
    }
    public String toString() {
        String resultado = "";
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                resultado += empleados[i].toString() + "\n";
            }
        }
        return resultado;
    }
}