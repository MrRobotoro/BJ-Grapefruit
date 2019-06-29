
public class Hut extends Item
{
   private String bezeichnung;
   private int preis;

    
    public Hut(String name, int preis)
    {
        bezeichnung = name;
        this.preis = preis;
        
    }
    
    public void datenAusgeben()
    {
        System.out.println(bezeichnung+":");
        System.out.print("Preis: "+preis+"€");
    }
    public String datenwertGeben()
    {
        return bezeichnung;
    }
}


