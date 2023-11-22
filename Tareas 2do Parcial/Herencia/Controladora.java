public class Controladora {
    public static void main(String[]args){
        //Ejemplo 1
        Herviboro herbivoro=new Herviboro();
        herbivoro.Alimentarse();
        
        Carnivoro carnivoro=new Carnivoro();
        carnivoro.Alimentarse();
        //Ejemplo 2
        Perro golden=new Perro();
        golden.hacerSonido();
        
        Gato esfinge=new Gato();
        esfinge.hacerSonido();
        
        //Ejemplo 3
        Coche miCoche = new Coche("Toyota", 4);
        System.out.println("Marca del coche: " + miCoche.marca);
        miCoche.arrancar();
        miCoche.conducir();
        miCoche.detener();
        
        //Ejemplo 4
        Gerente miGerente = new Gerente("Juan", 50000.0, "Ventas");

        System.out.println("Nombre del gerente: " + miGerente.nombre);
        System.out.println("Salario del gerente: $" + miGerente.salario);
        miGerente.trabajar();
        miGerente.recibirPago();
        miGerente.realizarRevision();
        
        //Ejemplo 5
        Carro myCoche = new Carro("Toyota", 4);

        System.out.println("Información del coche:");
        myCoche.acelerar();
        myCoche.mostrarInformacion();
        myCoche.abrirPuertas();
        
        //Ejemplo 6
        Motocicleta miMotocicleta = new Motocicleta("Harley-Davidson", false);
        System.out.println("\nInformación de la motocicleta:");
        miMotocicleta.acelerar();
        miMotocicleta.mostrarInformacion();
        miMotocicleta.ponerCasco();
        
        //Ejemplo 7
        Tren miTren = new Tren("Express", 200);

        miTren.iniciarViaje();
        miTren.detenerViaje();
        miTren.imprimirInformacion();

        System.out.println("\n-----------------------\n");

        Metro miMetro = new Metro("MetroX", 300, "Línea 1");

        miMetro.iniciarViaje();
        miMetro.anunciarEstacion("Estación A");
        miMetro.detenerViaje();
        miMetro.imprimirInformacion();
    }
}