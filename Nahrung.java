
public class Nahrung extends Item
{
    private String bezeichnung;
    private int preis;
    private int nährwert;
    
    public Nahrung(String name, int preis, int nährwert)
    {
        bezeichnung = name;
        this.preis = preis;
        this.nährwert = nährwert;
    }
    
    public void datenAusgeben()
    {
        System.out.println(bezeichnung+":");
        System.out.print("Nährwert:"+nährwert);
        System.out.print("Preis: "+preis+"€");
    }
    public String datenwertGeben()
    {
        return bezeichnung;
    }
}
