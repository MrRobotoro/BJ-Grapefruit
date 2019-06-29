
public class Datenknoten2 extends Baumelement
{
    private Baumelement naechsterL;
    private Baumelement naechsterR;
    private Nahrung inhalt;
     public Datenknoten2(Nahrung inhalt, Baumelement naechsterL, Baumelement naechsterR)
    {
        this.inhalt = inhalt;
        this.naechsterL = naechsterL;
        this.naechsterR = naechsterR;
    }
    
    public int anzahlDatenknotenGeben()
    {
        return 1 + naechsterL.anzahlDatenknotenGeben() + naechsterR.anzahlDatenknotenGeben();
    }
    
    public Nahrung inhaltGeben()
    {
        return inhalt;
    }
    
    public Baumelement naechsterLGeben()
    {
        return naechsterL;
    }
    
    public Baumelement naechsterRGeben()
    {
        return naechsterR;
    }
    
    public void PreOrderAusgabe()
    {
        inhalt.datenAusgeben();
        naechsterL.PreOrderAusgabe();
        naechsterR.PreOrderAusgabe();
        
        
    }
    public void InOrderAusgabe()
    {
        naechsterL.InOrderAusgabe();
        inhalt.datenAusgeben();
        naechsterR.InOrderAusgabe();
    }
    public void PostOrderAusgabe()
    {
        naechsterL.PostOrderAusgabe();
        naechsterR.PostOrderAusgabe();
        inhalt.datenAusgeben();
    }
    
    public Baumelement einfuegen(Nahrung d)
    {
        if(d.istKleiner(inhalt))
        {
            naechsterL = naechsterL.einfuegen(d);
        }
        else
        {
            naechsterR = naechsterR.einfuegen(d);
        }
        return this;
    }
    public Nahrung suche(Nahrung d)
    {
        if(d.istGleich(inhalt) == true)
        {
            return inhalt;         
        }
        else
        {
            if(d.istKleiner(inhalt)==true)
            {
                return naechsterL.suche(d);
                
            }
            else
            {
                return naechsterR.suche(d);
            }
        }
        
    }
 
}
