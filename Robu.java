import java.util.Random;
public class Robu extends Misuta
{
    private String name;
    private String eigenschaft;
    private String merkmal;
    private int erfahrung;
    private int Hungerwert;
    private boolean istSchmutzig;
    private boolean sterblich;
    private int Freudenwert;
    private Random rand = new Random();
    public Robu(String name)
    {
        this.name = name;
        merkmal = "verspielt";
        int n = rand.nextInt(3);
        if(n==1)
        {
            eigenschaft = "faul";
        }
        else if(n==2)
        {
            eigenschaft = "hyperaktiv";
        }
        else
        {
            eigenschaft = "verfressen";
        }
        erfahrung = 0;
        Hungerwert = 5;
        Freudenwert = 5;
        istSchmutzig = false; 
        sterblich =false;

    }

    public int erfahrungAddieren(int Erfahrungswert)
    {
        return erfahrung = erfahrung + Erfahrungswert;
    }

    public void speichern()
    {
    }

    public void datenAusgeben()
    {
        System.out.print("name: "+name);
        System.out.print("merkmal: "+merkmal);
        System.out.print("Erfahrungspunkte: "+erfahrung);
        System.out.println("----");
    }

    public int erfahrungGeben()
    {
        return erfahrung;
    }

    public void Sterblichkeit_Setzen(boolean a)
    {
        sterblich = a;
    }

    public String nameGeben()
    {
        return name;
    }

    public String eigenschaftGeben()
    {
        return eigenschaft;
    }

    public String merkmalGeben()
    {
        return merkmal;
    }

    public boolean istSchmutzigGeben()
    {
        return istSchmutzig;
    }

    public void DreckigRNG()
    {
        double x = Math.random();
        if(x <= 0.4)
        {
            System.out.println("Oh Nein! "+nameGeben()+" ist dreckig geworden");
            istSchmutzig = true;
        }

    }

    public void SauberSetzen()
    {
        if(istSchmutzigGeben() == true)
        {
            istSchmutzig = false;
            System.out.println(nameGeben()+" ist jetzt nicht mehr dreckig.");
            FreudenwertSetzen(1);
        }
        else
        {
            System.out.println(nameGeben()+" ist nicht dreckig.");
        }

    }

    public void HungerwertSetzen(Nahrung a)
    {
        Hungerwert = Hungerwert + a.nährwertGeben();
        if(Hungerwert > 5)
        {
            Hungerwert = 5;
        }
        a.AnzahlMinusEins();

    }

    public int HungerwertGeben()
    {
        return Hungerwert;
    }

    public void FreudenwertSetzen(int Freude)
    {
        Freudenwert = Freudenwert + Freude;
        if(Freudenwert > 5)
        {
            Freudenwert = 5;
        }

    }

}

