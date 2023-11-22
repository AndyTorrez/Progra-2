public class Cliente {
    private Servidor servido;
    public Cliente(Servidor servido){
        this.servido=servido;
    }
    
    public Servidor getServido() {
        return servido;
    }
}