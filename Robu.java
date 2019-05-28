import java.util.Random;
public class Robu extends Monster
{
    private String name;
    private String eigenschaft;
    private String merkmal;
    private int erfahrung;
    private int Hungerwert;
    private boolean istSchmutzig;
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
        System.out.print("eigenschaft: "+eigenschaft);
        System.out.print("merkmal: "+merkmal);
        System.out.print("Erfahrungspunkte: "+erfahrung);
    }
    
        public int erfahrungGeben()
    {
        return erfahrung;
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
    public void HungerwertSetzen(int Nährungswert)
    {
        Hungerwert = Hungerwert + Nährungswert;
        if(Hungerwert > 5)
        {
            Hungerwert = 5;
        }
        
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

