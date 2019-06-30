import java.util.*;
public class Einstellungen
{
    //WIP, nur erstellt, damit der Schlüssel generiert werden kann
    private String schwierigkeitsgrad;
    
    public void Einstellungen()
    {
    }
    
    protected boolean EinstellungenSetup()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Schwierigkeitsgrad wählen: ");
        System.out.println("   ");
        System.out.println("MEDIUM | Empfohlen für Spieler, die noch nebenbei ein Leben haben und Pflichten in der realen Welt erfüllen müssen");
        System.out.println("HARD   | Sie wollen die beste, intensivste Erfahrung und sich für immer an ein virtuelles Tier binden? Dann nur zu!");
        System.out.println("        (Warnung: Bei diesem Schwierigkeitsgrad kann das Haustier bei Vernachlässigung sterben.)");
        
        String SG = s.next();
        if(SG.equals("MEDIUM"))
        {
            System.out.println("----");
            schwierigkeitsgrad = "MEDIUM";
            return false;
        }
        else if(SG.equals("HARD"))
        {
            System.out.println("----");
            schwierigkeitsgrad = "HARD";
            return true;
        }
        else
        {
            System.out.println("Nicht verfügbare Schwierigkeit");
            EinstellungenSetup();
            return false;
        }
    }  

    protected String decodeSettings()
    {
        String speicher = schwierigkeitsgrad; 
        String b_schwierigkeitsgrad = Base64.getEncoder().withoutPadding().encodeToString(speicher.getBytes());

        return b_schwierigkeitsgrad;
    }

    protected void schwierigkeitsetup(String eingabe)
    {
        schwierigkeitsgrad = eingabe;
    }
}

