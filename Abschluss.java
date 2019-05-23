
public class Abschluss extends Listenelement 
{
    public Abschluss()
    {
        
    }
    public Listenelement naechsterGeben()
    {
        return this;
    }    
    public Raum inhaltGeben()
    {
        return null;
    }
    public int anzahlDatenknotenGeben()
    {
        return 0;
    }
    public Listenelement hintenAnfuegen(Raum bezeichnung)
    {
        Datenknoten neu = new Datenknoten(bezeichnung, this);
        
        return neu;
    }
    public void listenDatenAusgeben()
    {}
}
