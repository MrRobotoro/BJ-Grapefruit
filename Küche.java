public class Küche extends Raum
{
    private String bezeichnung;
    
    public Küche(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }
    
    public void datenAusgeben()
    {
        System.out.println(bezeichnung);
    }
    
    public Object datenwertGeben()
    {
        return bezeichnung;
    }
}
