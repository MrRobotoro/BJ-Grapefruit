import java.util.Scanner;
public class RaumListe
{
    private Listenelement wurzel;

    public RaumListe()
    {
        Abschluss abschl = new Abschluss();

        Raum Spielzimmer = new Spielzimmer("Spielzimmer");
        Raum Garten = new Garten("Garten");

        Datenknoten a,b;

        a = new Datenknoten(Garten, abschl);
        b = new Datenknoten(Spielzimmer, a);

        wurzel = b;

    }

    public Raum RaumWahl(String bezeichnung)
    {
        return wurzel.RaumGeben(bezeichnung);
    }

    public Listenelement wurzelGeben()
    {
        return wurzel;
    }

    public void RaumAnzahlGeben()
    {
        int RaumANZ = wurzel.anzahlDatenknotenGeben();
        System.out.println("Raumanzahl: "+RaumANZ);
    }

    public void RaumlisteAusgeben()
    {
        wurzel.listenDatenAusgeben();
    }

}
