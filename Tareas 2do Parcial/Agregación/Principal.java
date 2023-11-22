public class Principal {
    public static void main(String[] args) {
        
        //PROBANDO PRIMER EJEMPLO
        Servidor servidor = new Servidor();

        Cliente cliente = new Cliente(servidor);

        String resultado = cliente.getServido().servicio();

        System.out.println(resultado);
        
        //PROBANDO SEGUNDO EJEMPLO
        Persona propietario = new Persona("Juan");

        Casa casa = new Casa("123 Calle Principal", propietario);

        System.out.println(casa);
        
        //PROBANDO TERCER EJEMPLO
        Empresa empresa = new Empresa();
        Empleado empleado1 = new Empleado("Juan");
        Empleado empleado2 = new Empleado("Pedro");
        Empleado empleado3 = new Empleado("María");
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        System.out.println(empresa.toString());
        
        //PROBANDO CUARTO EJEMPLO
        Subject subject = new Subject();
        Student student = new Student();
        student.setSubject(subject);
        
        //PROBANDO QUINTO EJEMPLO
        Telefono telefono = new Telefono("555-1234");

        Sujeto sujeto = new Sujeto("Eduardo", telefono);

        System.out.println(sujeto);
        
        //PROBANDO SEXTO EJEMPLO
        Mesa mesa = new Mesa(1);
        Restaurante restaurante = new Restaurante("La Esquina", mesa);
        System.out.println(restaurante);
        
        //PROBANDO SEPTIMO EJEMPLO
        Perro perrito = new Perro("Firulais");
        Dueño persona = new Dueño("Manuel", perrito);
        System.out.println(persona);
        
        
    }
}
