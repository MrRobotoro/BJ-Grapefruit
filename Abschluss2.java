
public class Abschluss2 extends Baumelement
{
    

    public Baumelement hintenAnfuegen(Nahrung bezeichnung)
    {
        Datenknoten2 neu = new Datenknoten2(bezeichnung, this, this);

        return neu;
    }
        public Nahrung suche(Nahrung d)
    {
        System.out.println("Nicht vorhanden.'"+d+"'");
        return null;
        
    }
        public Baumelement einfuegen(Nahrung d)
    {
        Datenknoten2 neuk = new Datenknoten2(d,this,this);
        return neuk;
    }
    
    public void PreOrderAusgabe(){}
    public void InOrderAusgabe(){}
    public void PostOrderAusgabe(){}
    
    public Baumelement naechsterLGeben(){return null;}
    public Baumelement naechsterRGeben(){return null;}
    public int anzahlDatenknotenGeben(){return 0;}
    public Nahrung inhaltGeben(){return null;}
    

}
