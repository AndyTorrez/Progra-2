public class Arcoiris {
    public Rojo c1;
    public Naranja c2;
    public Amarillo c3;
    public Verde c4;
    public Azul c5;
    public Indigo c6;
    public Violeta c7;
    
    //clases en composición, al crean un arcoiris se crea con todos sus colores
    
    public Arcoiris(){
        c1=new Rojo("Rojo");
        c2=new Naranja("Naranja");
        c3=new Amarillo("Amarillo");
        c4=new Verde("Verde");
        c5=new Azul("Azul");
        c6=new Indigo("Indigo");
        c7=new Violeta("Violeta");
        
    }
}