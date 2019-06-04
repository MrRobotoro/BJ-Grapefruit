
public class Abschluss2 extends Listenelement2
{


    public Abschluss2()
    {

    }

    public Listenelement2 naechsterGeben()
    {
        return this;
    }    

    public Item inhaltGeben()
    {
        return null;
    }

    public int anzahlDatenknotenGeben()
    {
        return 0;
    }

    public Listenelement2 hintenAnfuegen(Item bezeichnung)
    {
        Datenknoten2 neu = new Datenknoten2(bezeichnung, this);

        return neu;
    }

    public void listenDatenAusgeben()
    {}

}
