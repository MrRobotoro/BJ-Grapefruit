public class Badezimmer extends Raum
{
    private String bezeichnung;
    
    public Badezimmer(String bezeichnung)
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
