import java.util.Scanner;
public class Nahrungsliste
{
    private Baumelement erster;

    public Nahrungsliste()
    {
        erster = new Abschluss2();
        
        Nahrung Apfel = new Nahrung("Apfel",1);
        Nahrung Burger = new Nahrung("Burger",3);
        Nahrung Pommes = new Nahrung("Pommes",2);
        
        Datenknoten2 A = new Datenknoten2(Apfel,erster,erster);
        Datenknoten2 B = new Datenknoten2(Burger,erster,erster);
        Datenknoten2 C = new Datenknoten2(Pommes,A,B);
        erster.PreOrderAusgabe();
    }
    
    
    public void InOrderAusgeben()
    {
        erster.InOrderAusgabe();
    }
    
    public Nahrung EssenSuchen()
    {
        Scanner s = new Scanner(System.in);
        String bezeichnung = s.next();
        Nahrung vgl = new Nahrung(bezeichnung,1);
        return erster.suche(vgl);
    }



}
