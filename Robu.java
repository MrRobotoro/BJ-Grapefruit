import java.util.Random;
public class Robu
{
    private String name;
    private String eigenschaft;
    private String merkmal;
    private int erfahrung;
    private int istHungrig;
    private boolean istSchmutzig;
    private int istGlücklich;
    private Random rand = new Random();
    public Robu(String name)
    {
        this.name = name;
        merkmal = "verspielt";
        int n = rand.nextInt(3);
        if(n==1)
        {
            eigenschaft = "verspielt";
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
        istHungrig = 5;
        istGlücklich = 5;
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
        System.out.print("EP: "+erfahrung);
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

}

