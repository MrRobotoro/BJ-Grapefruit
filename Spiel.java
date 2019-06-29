import java.util.*;
public class Spiel
{
    private RaumListe RListe;
    private Monster Mst;
    private Raum Standort;
    private String s_name;
    private String s_spezies;
    private Scanner s;
    public Spiel()
    {
        System.out.print('\f');
        s = new Scanner(System.in);
        start();
    }

    public void start()
    {
        String schluessel;
        String eingabe;
        
        System.out.println("Willkommen bei Project Grapefruit. Um fortzufahren, müssen wir wissen, ob du bereits einen Schlüssel besitzt. Wenn ja, dann schreibe bitte ja, ansonsten nein.");
        eingabe = s.next();
        
        if(eingabe.equals("ja"))
        {
            System.out.println("Bitte gebe nun deinen Schlüssel ein.");
            schluessel = s.next();
            schluesselentschluesseln(schluessel);
            System.out.println("Vielen Dank, dein Zustand wurde wiederhergestellt, viel Spaß!");
        }
        
        else if(eingabe.equals("nein"))
        {
            Monster_Erstellen();
        }
        else
        {
            System.out.println("Ungültige Eingabe. Bitte überprüfe deine Eingabe, das Setup wird neugestartet.");
        }
    }
    
    private void Monster_Erstellen()
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
            s_name = name;
            s_spezies = "Ryuu";
            Mst = new Ryuu(name);
            System.out.println("----");
        }
        else if(Spezies.equals("Robu"))
        {            
            System.out.println("Glückwunsch, ein Robu ist geschlüpft.");
            System.out.println("Wie soll es heißen? ");
            String name = s.next();
            s_name = name;
            s_spezies = "Robu";
            Mst = new Robu(name);
            System.out.println("----");
        }
        else
        {
            System.out.println("Keine bekannte Spezies! Bitte erneut eingeben.");
            Monster_Erstellen();        
        }
    }
    
    public void speichern()
    {
        System.out.println("Dein Spielstand wird nun gespeichert. Dazu wird dir ein Schlüssel ausgegeben, welchen du bitte auf deinem Rechner speicherst.");
        System.out.println(schluesselerstellen());
    }
    
    private String schluesselerstellen()
    {
        String name = Base64.getEncoder().withoutPadding().encodeToString(s_name.getBytes());
        String spezies = Base64.getEncoder().withoutPadding().encodeToString(s_spezies.getBytes());
        return name+","+spezies;
    }
    
    private void schluesselentschluesseln(String schlüssel)
    {
        String[] teile = schlüssel.split(",");
        String teil1 = teile[0];
        String teil2 = teile[1];
        String name = new String(Base64.getDecoder().decode(teil1.getBytes()));
        String spezies = new String(Base64.getDecoder().decode(teil2.getBytes()));
        s_name = name;
        s_spezies = spezies;
    }
}