public class Spielzimmer extends Raum
{
    private String bezeichnung;
    
    public Spielzimmer(String bezeichnung)
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
