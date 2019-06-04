
public class Datenknoten2 extends Listenelement2
{
    private Listenelement2 naechster;
    private Item inhalt;
    public Datenknoten2(Item inhalt, Listenelement2 naechster)
    {
        this.naechster = naechster;
        this.inhalt = inhalt;
    }
    public Listenelement2 naechsterGeben()
    {
        return naechster;
    }
    public Item inhaltGeben()
    {
        return inhalt;
    }
    public int anzahlDatenknotenGeben()
    {
        return naechster.anzahlDatenknotenGeben() + 1;
    }
    public Listenelement2 hintenAnfuegen(Item bezeichnung)
    {
        naechster = naechster.hintenAnfuegen(bezeichnung);
        return this;
    }
    public void listenDatenAusgeben()
    {
        //System.out.println(inhalt.nameGeben());
        naechsterGeben();
    }

}
