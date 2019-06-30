public abstract class Misuta
{
    public abstract String nameGeben();
    public abstract void datenAusgeben();
    public abstract void FreudenwertSetzen(int Freude);
    public abstract int HungerwertSetzen(Nahrung Nährwert);
    public abstract int HungerwertGeben();
    public abstract boolean istSchmutzigGeben();
    public abstract void SauberSetzen();
    public abstract void erfahrungAddieren(int a);
    public abstract boolean RNG(double P);
    public abstract void istSchmutzigSetzen(boolean a);
    public abstract void aufSterblichkeitPrüfen();
    public abstract void Hungerbekommen(int a);
}
