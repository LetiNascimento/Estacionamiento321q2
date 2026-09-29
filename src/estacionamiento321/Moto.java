package estacionamiento321;

public class Moto extends Vehiculo
{

    private Dureza dureza;

    public Moto(String patente, String marca, int modelo, Dureza dureza) {
        super(patente, marca, modelo);
        
        ValidarDureza(dureza);
        this.dureza = dureza;
    }
    
    private void ValidarDureza(Dureza dureza)
    {
        if(dureza == null)
        {
            throw new IllegalArgumentException("Dureza invalida");
        }
    }
    
    public Dureza getDureza()
    {
        return dureza;
    }
    
    public void setDureza(Dureza dureza)
    {
        ValidarDureza(dureza);
        this.dureza = dureza;
    }
    
    public boolean endurecer(Dureza dureza)
    {
        boolean endurecio = false;
                
        if(this.getDureza().ordinal() < dureza.ordinal())
        {
            this.setDureza(dureza);
            endurecio = true;
        }
        
        return endurecio;
    }
    
    public boolean ablandar(Dureza dureza)
    {
        boolean ablando = false;
        
        if (this.getDureza().ordinal() > dureza.ordinal())
        {
            this.setDureza(dureza);
            ablando = true;
        }
        return ablando;
    }
    
    public void colgar(){
        System.out.println("Moto haciendo Willy");
         
    }
    
    
}
