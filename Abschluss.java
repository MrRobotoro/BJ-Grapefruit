
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
        System.out.println("Dieser Raum exestiert nicht.");
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
    {
        System.out.println("----");
    }
    public Raum RaumGeben(String bezeichnung)
    {
        return null;
    }
}
