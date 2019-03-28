
package bel;


public class Cochera {
    private String estado;
    private int numero;

    public Cochera(int numero) {
        this.numero = numero;
        this.estado="libre";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }  
    
    
}
