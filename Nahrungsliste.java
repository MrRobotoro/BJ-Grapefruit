import java.util.Scanner;
public class Nahrungsliste
{
    private Baumelement wurzel;
    
    public Nahrungsliste()
    {
        Abschluss2 abschl = new Abschluss2();
        
        Nahrung Apfel = new Nahrung("Apfel",1);
        Nahrung Burger = new Nahrung("VeganBurger",3);
        Nahrung Pommes = new Nahrung("Pommes",2);
        
        Datenknoten2 A = new Datenknoten2(Apfel,abschl,abschl);
        Datenknoten2 B = new Datenknoten2(Burger,abschl,abschl);
        Datenknoten2 C = new Datenknoten2(Pommes,A,B);
        
        wurzel = C;
    }
    
    
    public void InOrderAusgeben()
    {
        wurzel.InOrderAusgabe();
    }
    
    public Nahrung EssenSuchen()
    {
        Scanner s = new Scanner(System.in);
        wurzel.InOrderAusgabe();
        String bezeichnung = s.next();
        Nahrung vgl = new Nahrung(bezeichnung,1);
        return wurzel.suche(vgl);
    }

}
