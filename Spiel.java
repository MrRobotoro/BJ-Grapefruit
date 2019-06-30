import java.util.*;
public class Spiel
{
    private RaumListe RListe;
    private Misuta Mst;
    private Raum Standort;


    private boolean Schwierigkeit;
    private String vgl;
    private Nahrungsliste NListe;


    private String s_name;
    private String s_spezies;
    
    

    private Scanner s;
    private Einstellungen einstellungen;

    public Spiel()
    {        
        System.out.print('\f');


        s = new Scanner(System.in);
        einstellungen = new Einstellungen("Easy");
        start();

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
        
        System.out.println("Ryuu: ");
        System.out.println("Die Flamme auf seiner Schwanzspitze zeigt seine Lebensenergie an.");
        System.out.println("Ist es gesund, leuchtet sie hell.");
        System.out.println("----");

        System.out.println("Robu:");
        System.out.println("Es liebt es zu spielen, besonders mit Wasser");
        System.out.println("----");
        System.out.println("Wähle ein Misuta!");

        MisutaWählen();

        if(vgl.equals("Ryuu"))
        {            
            System.out.println("Glückwunsch, du hast ein Ryuu erhalten.");
            System.out.println("Wie soll es heißen? ");
            String name = s.next();

            s_name = name;
            s_spezies = "Ryuu";


            Mst = new Ryuu(name);
            System.out.println("----");
        }
        else if(vgl.equals("Robu"))
        {            
            System.out.println("Glückwunsch, du hast ein Robu erhalten.");
            System.out.println("Wie soll es heißen? ");
            String name = s.next();
            
            s_name = name;
            s_spezies = "Robu";
            
            Mst = new Robu(name);
            System.out.println("----");
        }
        
        AktionenAuswahl();
    }
    
    
    

    public void start()
    {
        String schluessel;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Willkommen bei Project Grapefruit. Um fortzufahren, müssen wir wissen, ob du bereits einen Schlüssel besitzt. Wenn ja, dann schreibe bitte Ja, ansonsten Nein.");
        String eingabe = s.next();
        
        if(eingabe.equals("Ja"))
        {
            System.out.println("Bitte gebe nun deinen Schlüssel ein.");
            schluessel = s.next();
            schluesselentschluesseln(schluessel);
            System.out.println("Vielen Dank, dein Zustand wurde wiederhergestellt, viel Spaß!");
        }
        
        else if(eingabe.equals("Nein"))
        {
            
        }
        else
        {
            System.out.println("Ungültige Eingabe. Bitte überprüfe deine Eingabe, das Setup wird neugestartet.");
        }
    }
    

    
    public void AktionenAuswahl()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Aktion auswählen: ");
        System.out.println("    spielen");
        System.out.println("    füttern");
        System.out.println("    waschen");
        System.out.println("    MitasuInfo");
        System.out.println("    speichern");
        System.out.println("----");

        String Eingabe = s.next();
        
        if(Eingabe.equals("spielen"))
        {
            spielen();
            AktionenAuswahl();
        }
        else if(Eingabe.equals("füttern"))
        {
            füttern();
            AktionenAuswahl();
        }
        else if(Eingabe.equals("waschen"))
        {
            waschen();
            AktionenAuswahl();
        }
        else if(Eingabe.equals("Info"))
        {
            MitasuInfo();
            AktionenAuswahl();
        }
        else if(Eingabe.equals("speichern"))
        {
            speichern();
        }
        else
        {
            System.out.println("Keine verfügbare Aktion! Bitte wählen sie erneut aus.");
            AktionenAuswahl();
        }
    }
    

    public void Schwierigkeitsgrad_festlegen()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Schwierigkeitsgrad wählen: ");
        System.out.println("   ");
        System.out.println("Medium | Empfohlen für Spieler, die noch nebenbei ein Leben haben und Pflichten in der realen Welt erfüllen müssen");
        System.out.println("Hard   | Sie wollen die beste, intensivste Erfahrung und sich für immer an ein virtuelles Tier binden? Dann nur zu!");
        System.out.println("        (Warnung: Bei diesem Schwierigkeitsgrad kann das Haustier bei Vernachlässigung sterben.)");
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
            System.out.println("Nicht verfügbare Schwierigkeit");
            Schwierigkeitsgrad_festlegen();
        }
    }

    public void MisutaWählen()
    {
        Scanner s = new Scanner(System.in);
        
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
    
    public void MitasuInfo()
    {
        Mst.datenAusgeben();
    }

    public void füttern()
    { 
        Scanner s = new Scanner(System.in);
        
        if( Mst.istSchmutzigGeben() == true)
        {
            System.out.println( Mst.nameGeben()+" ist dreckig! Wasch es bevor sie es füttern!");
            return;
        }
        
        System.out.println("Was soll es essen?");
        int HW = Mst.HungerwertSetzen(NListe.EssenSuchen());
        
        if(Mst.RNG() == true && Mst.istSchmutzigGeben() == false)
        {
            System.out.println("Oh Nein! "+Mst.nameGeben()+" ist dreckig geworden!");
            Mst.istSchmutzigSetzen(true);
        }
        
        Mst.erfahrungAddieren(1);
        System.out.println("Hungerlevel ist nun auf "+HW);
        System.out.println("----");

    }
    

    public void waschen()
    {
        Mst.SauberSetzen();  
        System.out.println("----");
    }
    

    public void spielen()
    {
        if( Mst.istSchmutzigGeben() == true)
        {
            System.out.println(Mst.nameGeben()+" ist dreckig! Wasch es bevor sie mit ihm spielen!");
            return;
            
        }
        else if(Mst.RNG() == true && Mst.istSchmutzigGeben() == false)
        {
            System.out.println("Oh Nein! "+Mst.nameGeben()+" ist dreckig geworden.");
            Mst.istSchmutzigSetzen(true);
        }
        Mst.FreudenwertSetzen(3);
        Mst.erfahrungAddieren(2);
        System.out.println("----");
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
        String schwierigkeit = einstellungen.decodeSettings();
        return name+","+spezies+","+schwierigkeit;
    }
        
    
    private void schluesselentschluesseln(String schlüssel)
    {
        String[] teile = schlüssel.split(",");
        String teil1 = teile[0];
        String teil2 = teile[1];
        String teil3 = teile[2];
        String name = new String(Base64.getDecoder().decode(teil1.getBytes()));
        String spezies = new String(Base64.getDecoder().decode(teil2.getBytes()));
        String schwierigkeit = new String(Base64.getDecoder().decode(teil3.getBytes()));
        
        s_name = name;
        s_spezies = spezies;
        //einstellungen.schwierigkeitsetup(schwierigkeit);
    }

}