
public class Nahrung 
{
    private String bezeichnung;
    //private int preis;
    private int nährwert;
    private int anzahl;
    
    public Nahrung(String name, int nährwert)
    {
        bezeichnung = name;
        //this.preis = preis;
        this.nährwert = nährwert;
        anzahl = 3;
    }
    
    public String datenwertGeben()
    {
        return bezeichnung;
    }
    
    public int AnzahlMinusEins()
    {        
        return anzahl = anzahl -1;
    }
    
    public int nährwertGeben()
    {
        return nährwert;
    }
    
    public void datenAusgeben()
    {
        System.out.println(bezeichnung);

    }
    
    
    public boolean istKleiner(Nahrung d)
    {
        String vgl = (String)d.datenwertGeben();
        if(vgl.compareTo(bezeichnung)> 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean istGleich(Nahrung d)
    {
        String vgl = (String)d.datenwertGeben();
        return vgl.equals(this.datenwertGeben());
    }

}
