import java.util.*;
//VGVzdA,Unl1dQ,TWVkaXVt,MQ
public class Spiel 
{
    private RaumListe RListe;
    private Misuta Mst;
    private String Standort;
    private boolean ON;

    private boolean Schwierigkeit;
    private String vgl;
    private Nahrungsliste NListe;
    private Musik ST;

    private String s_name;
    private String s_spezies;

    private Scanner s;
    private Einstellungen einstellungen;

    public Spiel() throws Exception
    {
        RListe = new RaumListe();
        NListe = new Nahrungsliste();
        einstellungen = new Einstellungen();
        Standort = RListe.RaumWahl("Spielzimmer").datenwertGeben();

        ON = true;
        ST = new Musik();
        ST.startMusik(1);

        System.out.print('\f');
        s = new Scanner(System.in);
        start();
    }

    public void Raumwechseln()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Sie befinden sich im "+Standort+".");
        System.out.println("In welches Zimmer möchten sie wechseln?");
        RListe.RaumlisteAusgeben();
        String R = s.next();
        if(R.equals(Standort) == true)
        {
            System.out.println("Sie sind bereits im "+Standort+".");
        }
        else if(RListe.RaumWahl(R) == null)
        {
            System.out.println("Kein Raum mit dieser Bezeichnung.");
        }
        else
        {
            Standort = RListe.RaumWahl(R).datenwertGeben();
            if(Standort == "Garten")
            {
                ST.stop();
                ST.startMusik(0);
            }
            else if(Standort == "Spielzimmer")
            {
                ST.stop();
                ST.startMusik(1);
            }

        }
    }

    public void start() throws Exception
    {
        String schluessel;
        Scanner s = new Scanner(System.in);

        System.out.println("Willkommen bei Project Grapefruit/Misuta.");
        System.out.println("Um fortzufahren, müssen wir wissen, ob du bereits einen Schlüssel besitzt."); 
        System.out.println("Wenn ja, dann schreibe bitte Ja, ansonsten Nein.");
        String eingabe = s.next();

        if(eingabe.equals("Ja"))
        {
            System.out.println("Bitte gebe nun deinen Schlüssel ein.");
            schluessel = s.next();
            schluesselentschluesseln(schluessel);
            System.out.println("🔒");
            System.out.println("Processing...");
            Thread.sleep(3000);
            System.out.println("🔓");
            Thread.sleep(1000);
            System.out.println("Vielen Dank, dein Zustand wurde wiederhergestellt, Viel Spaß!");
            AktionenAuswahl();
        }

        else if(eingabe.equals("Nein"))
        {
            Schwierigkeitsgrad_festlegen();

            System.out.println("Hallo! Herzlich Willkommen in der Welt der Misuta!");

            Thread.sleep(1500);

            System.out.println("Mein Name ist Ketchum! Man nennt mich den Misuta-Professor! Diese Welt wird von Wesen bewohnt, die man Misuta nennt!");
            System.out.println("Für manche Leute sind Misuta Haustiere, für andere Familienmitglieder. Ich selbst habe mein Hobby zum Beruf gemacht und studiere Misuta.");
            System.out.println("Ich habe mir einst die Aufgabe gemacht die Welt der Misuta zu erforschen. ");
            System.out.println("Du kannst mir gerne bei meinen Studien helfen, indem du dich so lange wie möglich um ein Misuta kümmerst!");
            System.out.println("Ich habe dir zwei Exemplare mitgebracht:");

            System.out.println("----");
            Thread.sleep(7000);

            System.out.println("Ryuu: ");
            System.out.println("Die Flamme auf seiner Schwanzspitze zeigt seine Lebensenergie an.");
            System.out.println("Ist es gesund, leuchtet sie hell.");
            System.out.println("----");
            Thread.sleep(3000);

            System.out.println("Robu:");
            System.out.println("Es liebt es zu spielen, besonders mit Wasser");
            System.out.println("----");
            Thread.sleep(2000);

            System.out.println("Wähle ein Misuta!");

            MisutaWählen();

            if(vgl.equals("Ryuu"))
            {            
                System.out.println("Glückwunsch, du hast ein Ryuu erhalten.");
                Thread.sleep(1500);
                System.out.println("----");
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
                System.out.println("----");
                System.out.println("Wie soll es heißen? ");
                String name = s.next();

                s_name = name;
                s_spezies = "Robu";

                Mst = new Robu(name);
                System.out.println("----");
            }
            AktionenAuswahl();
        }
        else
        {
            System.out.println("Ungültige Eingabe. Bitte überprüfe deine Eingabe, das Setup wird neugestartet...");
            Thread.sleep(3000);
            System.out.print('\f');
            start();
        }
    }

    public void MusikVerwalten()
    {
        if(ON == true)
        {   
            if(Standort == "Garten")
            {
                ON = false;     
                ST.stop();  
            }
            else if(Standort == "Spielzimmer")
            {   
                ON = false;     
                ST.stop();                
            }
        }
        else
        {       
            if(Standort == "Garten")
            {  
                ON = true;
                ST.startMusik(0);
            }
            else if(Standort == "Spielzimmer")
            {                
                ON = true;
                ST.startMusik(1);
            }
        }        
    }    

    public void AktionenAuswahl() throws Exception
    {
        Scanner s = new Scanner(System.in);

        if(Standort.equals("Garten"))
        {
            System.out.println("----");
            System.out.println("Aktion auswählen:   ");
            System.out.println("     Spielen ⚽");
            System.out.println("     Waschen 🛀");
            System.out.println("     Raumauswahl 🏠");
            System.out.println("     Info ℹ");
            System.out.println("     Musik 🔊");
            System.out.println("     Speichern 📥");
            System.out.println("----");
        }
        else if(Standort.equals("Spielzimmer"))
        {
            System.out.println("----");
            System.out.println("Aktion auswählen:   ");
            System.out.println("     Spielen ⚽");
            System.out.println("     Füttern 🍖");
            System.out.println("     Raumauswahl 🏠");
            System.out.println("     Info ℹ");
            System.out.println("     Musik 🔊");
            System.out.println("     Speichern 📥");
            System.out.println("----");
        }

        String Eingabe = s.next();

        if(Eingabe.equals("Spielen"))
        {
            spielen();
            Thread.sleep(1200);
            AktionenAuswahl();

        }
        else if(Eingabe.equals("Füttern"))
        {
            füttern();
            Thread.sleep(1200);
            AktionenAuswahl();
        }
        else if(Eingabe.equals("Waschen"))
        {
            waschen();
            Thread.sleep(1200);
            AktionenAuswahl();
        }
        else if(Eingabe.equals("Raumauswahl"))
        {
            Raumwechseln();
            Thread.sleep(1200);
            AktionenAuswahl();
        }
        else if(Eingabe.equals("Info"))
        {
            MitasuInfo();
            Thread.sleep(1200);
            AktionenAuswahl();
        }
        else if(Eingabe.equals("Musik"))
        {
            MusikVerwalten();
            Thread.sleep(1200);
            AktionenAuswahl();
        }
        else if(Eingabe.equals("Speichern"))
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
        Schwierigkeit = einstellungen.EinstellungenSetup();
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
        if(Mst.istSchmutzigGeben() == true)
        {
            System.out.println( Mst.nameGeben()+" ist dreckig! Wasch es bevor sie es füttern!");
            return;
        }
        else
        {
            if(Standort.equals("Garten") == true)
            {
                System.out.println("Sie müssen im Haus sein um ihr Misuta zu füttern.");
                return;
            }
            else
            {
                System.out.println("Was soll es essen?");
                int HW = Mst.HungerwertSetzen(NListe.EssenSuchen());
                if(HW == 0)
                {
                    return;
                }
                else
                {
                    if(Mst.RNG(0.3) == true && Mst.istSchmutzigGeben() == false)
                    {
                        System.out.println("Oh Nein! "+Mst.nameGeben()+" ist dreckig geworden!");
                        Mst.istSchmutzigSetzen(true);
                    }

                    Mst.erfahrungAddieren(1);
                    System.out.println("Hungerlevel ist nun auf "+HW);
                    System.out.println("----");
                }
            }
        }
    }

    public void waschen()
    {
        if(Standort.equals("Spielzimmer") == true)
        {
            System.out.println("Rohrbruch...Sie müssen ihr Misuta im Garten mit den Schlauch abspülen");
            return;
        }
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
        else if(Mst.HungerwertGeben() <= 0)
        {
            System.out.println(Mst.nameGeben()+" hat Hunger! Füttern sie es bevor sie mit ihm spielen!");
            return;
        }
        else if(Mst.RNG(0.42) == true && Mst.istSchmutzigGeben() == false)
        {
            System.out.println("Oh Nein! "+Mst.nameGeben()+" ist dreckig geworden.");
            Mst.istSchmutzigSetzen(true);
        }
        Mst.FreudenwertSetzen(3);
        Mst.erfahrungAddieren(2);
        if(Mst.RNG(0.3) == true)
        {
            Mst.Hungerbekommen(3);
        }
        else
        {
            Mst.Hungerbekommen(2);
        }
        System.out.println("----");
    }

    private void speichern()
    {
        System.out.println("Dein Spielstand wird nun gespeichert. Dazu wird dir ein Schlüssel ausgegeben, welchen du bitte auf deinem Rechner speicherst.");
        System.out.println(schluesselerstellen());
        ST.stop();
    }

    private String schluesselerstellen()
    {
        String name = Base64.getEncoder().withoutPadding().encodeToString(s_name.getBytes());
        String spezies = Base64.getEncoder().withoutPadding().encodeToString(s_spezies.getBytes());
        String schwierigkeit = einstellungen.decodeSettings();
        String xp = Integer.toString(Mst.erfahrungGeben());
        xp = Base64.getEncoder().withoutPadding().encodeToString(xp.getBytes());

        return name+","+spezies+","+schwierigkeit+","+xp;
    }

    private void schluesselentschluesseln(String schlüssel)
    {
        String[] teile = schlüssel.split(",");
        String teil1 = teile[0];
        String teil2 = teile[1];
        String teil3 = teile[2];
        String teil4 = teile[3];
        String name = new String(Base64.getDecoder().decode(teil1.getBytes()));
        String spezies = new String(Base64.getDecoder().decode(teil2.getBytes()));
        String schwierigkeit = new String(Base64.getDecoder().decode(teil3.getBytes()));
        String xp = new String(Base64.getDecoder().decode(teil4.getBytes()));
        int exp = Integer.valueOf(xp);

        s_name = name;
        s_spezies = spezies;
        if(spezies.equals("Ryuu"))
        {
            Mst = new Ryuu(name);
        }
        else
        {
            Mst = new Robu(name);
        }
        Mst.xpsetzen(exp);
        einstellungen.schwierigkeitsetup(schwierigkeit);
    }

}