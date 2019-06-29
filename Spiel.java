import java.util.Scanner;
public class Spiel
{
    private RaumListe RListe;
    private Monster Mst;
    private Raum Standort;

    public Spiel()
    {
        System.out.print('\f');
        Monster_Erstellen();

    }

    public void Monster_Erstellen()
    {
        System.out.println("Wähle eine Spezies!");
        System.out.println("----");
        System.out.println("Ryuu: ");
        System.out.println("The fire on the tip of its tail is a measure of its life.");
        System.out.println("If healthy, its tail burns intensely.");
        System.out.println("----");
        System.out.println("Robu:");
        System.out.println(" It loves playing around, especially when water is involved");
        System.out.println("----");
        Scanner s = new Scanner(System.in);
        System.out.println("Spezies eingeben: ");
        String Spezies = s.next();
        if (Spezies.equals("Ryuu"))
        {            
            System.out.println("Glückwunsch, ein Ryuu ist geschlüpft.");
            System.out.println("Wie soll es heißen? ");
            String name = s.next();        
            Mst = new Ryuu(name);
            System.out.println("----");
        }
        else if(Spezies.equals("Robu"))
        {            
            System.out.println("Glückwunsch, ein Robu ist geschlüpft.");
            System.out.println("Wie soll es heißen? ");
            String name = s.next();
            Mst = new Robu(name);
            System.out.println("----");
        }
        else
        {
            System.out.println("Keine bekannte Spezies! Bitte erneut eingeben.");
            Monster_Erstellen();        
        }
    }
    
    
}