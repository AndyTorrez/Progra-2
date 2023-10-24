public class AppleWatch extends DispositivoMovil{
    
    private int pasos;
    
    public AppleWatch() {
        super(0);
        marca="Apple Watch";
        modelo="Series 6";
    }
    
    public void verInfo(){
        System.out.println("La informacion del dispositivo es la siguiente:\nMarca: "+marca+"\nModelo: "+modelo);
    }
    
    public void pasosDelDia(int pasos){
        
        System.out.println("Hemos dado "+pasos+" pasos en el día!!! SIGUE ASI!");
    }
    
}
