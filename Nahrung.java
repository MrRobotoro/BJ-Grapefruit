
public class Nahrung 
{
    private String bezeichnung;
    //private int preis;
    private int nährwert;
    private int anzahl;
    
    public Nahrung( String name, int nährwert)
    {        
        bezeichnung = name;
        //this.preis = preis;
        this.nährwert = nährwert;
        anzahl = 5;
    }
    
    public String datenwertGeben()
    {
        return bezeichnung;
    }
    
    public int AnzahlGeben()
    {
        return anzahl;
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
        System.out.println(bezeichnung+", "+anzahl+" Stk. übrig");

    }
    
    
 public boolean istKleiner(Nahrung dat)
    {
        String vergl = (String) dat.datenwertGeben();
        if(bezeichnung.compareTo(vergl) < 0)
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
        return bezeichnung.equals(vgl);
    }

}
