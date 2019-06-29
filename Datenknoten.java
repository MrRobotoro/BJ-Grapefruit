public class Datenknoten extends Listenelement 
{
    private Listenelement naechster;
    private Raum inhalt;
    public Datenknoten(Raum inhalt, Listenelement naechster)
    {
        this.naechster = naechster;
        this.inhalt = inhalt;
    }
    public Listenelement naechsterGeben()
    {
        return naechster;
    }
    public Raum inhaltGeben()
    {
        return inhalt;
    }
    public int anzahlDatenknotenGeben()
    {
        return naechster.anzahlDatenknotenGeben() + 1;
    }
    public Listenelement hintenAnfuegen(Raum bezeichnung)
    {
        naechster = naechster.hintenAnfuegen(bezeichnung);
        return this;
    }
    public void listenDatenAusgeben()
    {
        System.out.println(inhalt.datenwertGeben());
        naechsterGeben().listenDatenAusgeben();
    }
}
