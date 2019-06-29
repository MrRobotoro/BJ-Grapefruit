import java.util.*;
public class Einstellungen
{
    //WIP, nur erstellt, damit der Schlüssel generiert werden kann
    private double wert1;
    private double wert2;
    private double wert3;
    private String schwierigkeitsgrad;
    public Einstellungen(String schwierigkeitsgrad)
    {
        this.schwierigkeitsgrad = schwierigkeitsgrad;
        if(schwierigkeitsgrad.equals("Easy"))
        {
            wert1 = 0.5;
            wert2 = 0.5;
            wert3 = 0.5;
        }
        else if(schwierigkeitsgrad.equals("Medium"))
        {
            wert1 = 1;
            wert2 = 1;
            wert3 = 1;
        }
        else if(schwierigkeitsgrad.equals("Hard"))
        {
            wert1 = 2;
            wert2 = 2;
            wert3 = 2;
        }
        else
        {System.out.println("Deine Eingabe konnte nicht bestimmt werden, bitte überprüfe es, das Setup wird neugestartet");}
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

