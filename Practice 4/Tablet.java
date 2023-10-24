public class Tablet extends DispositivoMovil {
    
    private String contraseña;
    
    public Tablet(String contraseña){
        super(0);
        this.contraseña=contraseña;
        sistemaOperativo="Android";
        cargaBateria=67;

    }
    
    public void IngresarContraseña(String contraseña){
        System.out.println("Verificando contraseña");
        System.out.println("La contraseña "+contraseña+" es correcta\nTablet DESBLOQUEADA");
        
    }

}
