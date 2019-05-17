public abstract class Listenelement
{
    public abstract Listenelement naechsterGeben();
    public abstract Listenelement naechsterSetzen(Listenelement naechster);
    public abstract void inhaltGeben();
    public abstract int anzahlDatenknotenGeben();
    public abstract void hintenAnfuegen(Raum bezeichnung);
    public abstract void listenDatenAusgeben();
}
