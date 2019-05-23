
istimport java.util.Random;
public class Ryuu extends Monster
{
    private String name;
    private String eigenschaft;
    private String merkmal;
    private int erfahrung;
    private int istHungrig;
    private boolean istSchmutzig;
    private int istGlücklich;
    private Random rand = new Random();
    public Ryuu(String name)
    {
        this.name = name;
        merkmal = "stolz";
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
        istHungrig = 5;
        istGlücklich = 5;
        istSchmutzig = false; 

        

    }
    
    public int erfahrungAddieren(int Erfahrungswert)
    {
        return erfahrung = erfahrung + Erfahrungswert;
    }
    
    

}

