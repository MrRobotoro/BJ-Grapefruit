
public abstract class Baumelement 
{
    public abstract Baumelement naechsterLGeben();
    public abstract Baumelement naechsterRGeben();
    public abstract int anzahlDatenknotenGeben();
    public abstract Nahrung inhaltGeben();
    
    public abstract void PreOrderAusgabe();
    public abstract void InOrderAusgabe();
    public abstract void PostOrderAusgabe();
    
    public abstract Baumelement einfuegen(Nahrung d);
    public abstract Nahrung suche(Nahrung d);

}
