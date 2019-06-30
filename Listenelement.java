public abstract class Listenelement
{
    public abstract Listenelement naechsterGeben();
    public abstract Raum inhaltGeben();
    public abstract int anzahlDatenknotenGeben();
    public abstract Listenelement hintenAnfuegen(Raum bezeichnung);
    public abstract void listenDatenAusgeben();
    public abstract Raum RaumGeben(String a);
}
