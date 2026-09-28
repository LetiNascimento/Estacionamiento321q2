package estacionamiento321;

public class Auto extends Vehiculo
{
    private final Color color;
    
    public Auto(String patente, String marca, int modelo, Color color)
    {
        super(patente, marca, modelo);
        
        validarColor(color);
        this.color = color;
    }
    
    private static void validarColor(Color color)
    {
        if (color == null)
        {
            throw new IllegalArgumentException("Color invalido.");
        }
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public String acelerar()
    {
        return "Auto acelerando.";
    }
    
    public String frenar()
    {
        return "Auto frenando.";
    }
    
}
