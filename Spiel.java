import java.util.Scanner;
public class Spiel
{
    private RaumListe RListe;
    private Misuta Mst;
    private Raum Standort;
    private boolean Schwierigkeit;
    private String vgl;
    private Nahrungsliste NListe;

    public Spiel()
    {        
        System.out.print('\f');

        Scanner s = new Scanner(System.in);

        RListe = new RaumListe();
        NListe = new Nahrungsliste();

        Schwierigkeitsgrad_festlegen();

        System.out.println("Hallo! Herzlich Willkommen in der Welt der Misuta!");
        System.out.println("Mein Name ist Ketchum! Man nennt mich den Misuta-Professor! Diese Welt wird von Wesen bewohnt, die man Misuta nennt!");
        System.out.println("Für manche Leute sind Misuta Haustiere, für andere Familienmitglieder. Ich selbst habe mein Hobby zum Beruf gemacht und studiere Misuta.");
        System.out.println("Ich habe mir einst die Aufgabe gemacht die Welt der Misuta zu erforschen. ");
        System.out.println("Du kannst mir gerne bei meinen Studien helfen, indem du dich so lange wie möglich um ein Misuta kümmerst!");
        System.out.println("Ich habe dir zwei Exemplare mitgebracht:");

        System.out.println("----");

        System.out.println("Wähle ein Misuta!");
        System.out.println("----");
        System.out.println("Ryuu: ");
        System.out.println("Die Flamme auf seiner Schwanzspitze zeigt seine Lebensenergie an.");
        System.out.println("Ist es gesund, leuchtet sie hell.");
        System.out.println("----");

        System.out.println("Robu:");
        System.out.println("Es liebt es zu spielen, besonders mit Wasser");
        System.out.println("----");

        MisutaWählen();

        if(vgl.equals("Ryuu"))
        {            
            System.out.println("Glückwunsch, du hast ein Ryuu erhalten.");
            System.out.println("Wie soll es heißen? ");
            String name = s.next();
            Mst = new Ryuu(name);
            System.out.println("----");
        }
        else if(vgl.equals("Robu"))
        {            
            System.out.println("Glückwunsch, du hast ein Robu erhalten.");
            System.out.println("Wie soll es heißen? ");
            String name = s.next();
            Mst = new Robu(name);
            System.out.println("----");
        }

    }

    public void Schwierigkeitsgrad_festlegen()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Schwierigkeitsgrad wählen: ");
        System.out.println("   ");
        System.out.println("Medium | Empfohlen für Spieler, die noch nebenbei ein Leben haben und Pflichten in der realen Welt erfüllen müssen");
        System.out.println("Hard | Sie wollen die beste, intensivste Erfahrung und sich für immer an ein virtuelles Tier binden? Dann nur zu!");
        System.out.println("      (Warnung: Bei diesem Schwierigkeitsgrad kann das Haustier bei Vernachlässigung sterben.)");
        String SG = s.next();
        if(SG.equals("Medium"))
        {
            Schwierigkeit = false;
            System.out.println("----");
        }
        else if(SG.equals("Hard"))
        {
            Schwierigkeit = true;
            System.out.println("----");
        }
        else
        {
            System.out.println("Keine verfügbare Schwierigkeit");
            Schwierigkeitsgrad_festlegen();
        }
    }

    public void MisutaWählen()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Misuta eingeben: ");
        String nam = s.next();
        if(nam.equals("Ryuu"))
        {            
            vgl = "Ryuu";              
        }
        else if(nam.equals("Robu"))
        {
            vgl = "Robu";
        }
        else
        {
            System.out.println("Keine bekannte Spezies! Bitte erneut eingeben.");
            MisutaWählen();
        }        
    }

    public void datenAusgeben()
    {
        Mst.datenAusgeben();
    }

    public void füttern()
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Was soll es essen?");
        Mst.HungerwertSetzen(NListe.EssenSuchen());
        Mst.FreudenwertSetzen(1);
        System.out.println("Hungerlevel ist nun auf "+Mst.HungerwertGeben());

    }

    public void waschen()
    {
        Mst.SauberSetzen();  
    }
    
    public void spielen()
    {
        Mst.FreudenwertSetzen(3);
    }
}