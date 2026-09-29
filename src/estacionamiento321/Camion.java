
package estacionamiento321;

public class Camion extends Vehiculo {
    
    private double carga;
    private final double cargaMaxima = 0;

    public Camion(String patente, String marca, int modelo) {
        super(patente, marca, modelo);
        validarPositivo(cargaMaxima);
        this.cargaMaxima = cargaMaxima;
    }
    
    private void validarPositivo (double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Carga negativa");
            
        }
    }
    private double validarCarga(double carga){
      validarPositivo(carga);
      
        if((total = this.carga + carga) > cargaMaxima){
            throw new IllegalArgumentException("Mucha carga!!!!");
        }
        return total;
    }
    
    private void cargar(double carga){
        this.carga = validarCarga(carga);
        
    }
            
            
            
            
            
            
            
            
}
