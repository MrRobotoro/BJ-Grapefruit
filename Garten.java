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
    
    public String datenwertGeben()
    {
        return bezeichnung;
    }
    
    public boolean istGleich(String d)
    {
        String vgl = (String)d;
        return bezeichnung.equals(vgl);
    }
}
