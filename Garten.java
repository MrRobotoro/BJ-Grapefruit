public class Garten extends Raum
{
    private String bezeichnung;
    
    public Garten(String bezeichnung)
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
