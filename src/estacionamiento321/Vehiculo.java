package estacionamiento321;

import java.util.Objects;

public class Vehiculo 
{
    private static final int MIN_MODEL = 2000;
    private static final int MAX_MODEL = 2026;
    
    private String patente;
    private String marca;
    private int modelo;
    
    public Vehiculo(String patente, String marca, int modelo)
    {
        validarParametros(patente, marca, modelo);
        
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    private void validarParametros(String patente, String marca, int modelo)
    {
        validarPatente(patente);
        validarMarca(marca);
        validarModelo(modelo);
    }
    
    private void validarPatente(String patente)
    {
        if (patente == null || patente.isBlank() || patente.isEmpty())
        {
            throw new IllegalArgumentException("Patente invalida.");
        }
    }
    
    private void validarMarca(String marca)
    {
        if (marca == null || marca.isBlank() || marca.isEmpty())
        {
            throw new IllegalArgumentException("Marca invalida.");
        }
    }
    
    private void validarModelo(int modelo)
    {
        if (!(modelo >= MIN_MODEL && modelo <= MAX_MODEL))
        {
            throw new IllegalArgumentException("Modelo invalido.");
        }
    }
    
    public String getPatente()
    {
        return this.patente;
    }
    
    public boolean tieneEstaPatente(String patente)
    {
        return this.patente.equals(patente);
    }
    
    @Override
    public String toString()
    {
        return "Vehiculo - Patente = %s, Marca = %s, Modelo = $d".formatted(patente, marca, modelo);
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }
        if(o == this)
        {
            return true;
        }
        if(o instanceof Vehiculo otroVehiculo)
        {
            return patente.equals(otroVehiculo.patente)
                    && modelo == otroVehiculo.modelo;
        }code:
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(patente,modelo);
    }
}
