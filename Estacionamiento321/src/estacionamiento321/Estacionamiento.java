package estacionamiento321;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Estacionamiento
{
    private String nombre;
    private final ArrayList<Vehiculo> vehiculos;
    
    public Estacionamiento(String nombre)
    {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo)
    {
        Objects.requireNonNull(vehiculo);
        if(vehiculos.contains(vehiculo))
        {
            throw new IllegalArgumentException("Vehiculo repetido.");
        }
        vehiculos.add(vehiculo);
    }
    
    public boolean estaVacio()
    {
        return vehiculos.isEmpty();
    }
    
    public ArrayList<Vehiculo> getVehiculos()
    {
        return new ArrayList<>(vehiculos);
    }
    
    public String getVehiculosString()
    {
        StringBuilder sb = new StringBuilder();
        for (Vehiculo v : vehiculos)
        {
            sb.append(v);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    
    public int cantidadVehiculos()
    {
        return vehiculos.size();
    }
    
    private int indiceVehiculo(String patente)
    {
        int indice = -1;
        int i = 0;
        int totalVehiculos = vehiculos.size();
        while (i < totalVehiculos && indice == -1)
        {
            Vehiculo v = vehiculos.get(i);
            if(v.tieneEstaPatente(patente))
            {
                indice = i;
            }
            i++;
        }
        return indice;
    }
    
    public boolean estaVehiculo(String patente)
    {
        return  indiceVehiculo(patente) != -1;
    }
    
    public Vehiculo retirarVehiculo(String patente)
    {
        int indice = indiceVehiculo(patente);
        if (indice == -1)
        {
            throw new NoSuchElementException("No existe auto con esta patente.");
        }
        return vehiculos.remove(indice);
    }
}
