import java.util.Random;
public class Ryuu extends Misuta
{
    private String name;
    private String eigenschaft;
    private String merkmal;
    private int erfahrung;
    private int Hungerwert;
    private boolean istSchmutzig;
    private boolean sterblich;
    private int Freudenwert;
    private Nahrungsliste Nahrungsliste;
    private Random rand = new Random();

    public Ryuu(String name)
    {
        Nahrungsliste = new Nahrungsliste();
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
        erfahrung = 1;
        Hungerwert = 5;
        Freudenwert = 5;
        istSchmutzig = false; 
        sterblich = false;

    }

    public void aufSterblichkeitPrüfen() //Noch nicht in Spiel-Klasse, da noch keine Funktion
    {
        if(Hungerwert == 0 && Freudenwert != 0)
        {
            System.out.println("*"+nameGeben()+"* (っ◔◡◔)っ hungrig ");
            System.out.println("Dein Ryuu scheint hungrig zu sein, du solltest es besser füttern");
            return;
        }
        else if(Hungerwert != 0 && Freudenwert == 0)
        {
            System.out.println("*"+nameGeben()+"* (っ◔◡◔)っ  traurig ");
            System.out.println("Dein Ryuu scheint traurig zu sein, du solltest mit ihm spielen");
            return;
        }
        else if(Hungerwert == 0 && Freudenwert == 0)
        {
            if(sterblich == true)
            { 
                System.out.println("*"+nameGeben()+"* (っ◔◡◔)っ  D:");
                System.out.println("Deinem Ryuu scheint es sehr schlecht zu gehen, kümmere dich besser darum bevor es stirbt...");
                return;
            }
            else if(sterblich == true && Hungerwert == 0 && Freudenwert == 0 && istSchmutzig == true) //technisch gesehen noch nicht möglich, weil durch spielen() wieder Freude entsteht
            {            
                System.out.println(nameGeben()+" ist gestorben. Rip");
                return;
            }  
            else if(sterblich == false)
            {
                System.out.println("*"+nameGeben()+"* (っ◔◡◔)っ  D:");
                System.out.println("Deinem Ryuu scheint es sehr schlecht zu gehen, kümmere dich besser darum.");
                return;
            }
        }
    }

    public void erfahrungAddieren(int Erfahrungswert)
    {
        erfahrung = erfahrung + Erfahrungswert;
        System.out.println("+"+Erfahrungswert+"xp");
    }

    public void datenAusgeben()
    {
        System.out.println("Mitasu Info: ");
        System.out.println("   Name:             "+name);
        System.out.println("   Besitzer:         Sie?");
        System.out.println("   Merkmal:          "+merkmal);
        System.out.println("   Art:              Ryuu");
        System.out.println("   Erfahrungspunkte: "+erfahrung);
        System.out.println("----");
    }

    public int erfahrungGeben()
    {
        return erfahrung;
    }

    public void istSchmutzigSetzen(boolean a)
    {
        istSchmutzig = a;
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

    public boolean RNG(double P)
    {
        double x = Math.random();
        if(x <= P)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void Hungerbekommen(int a)
    {
        Hungerwert = Hungerwert - a;
        if(Hungerwert>0)
        {
            System.out.println(nameGeben()+" hat wohl Hunger bekommen, sie sollten es füttern.");
        }
    }

    public void SauberSetzen()
    {
        if(istSchmutzigGeben() == true)
        {
            istSchmutzig = false;
            System.out.println(nameGeben()+" ist jetzt nicht mehr dreckig.");
            erfahrungAddieren(1);

        }
        else
        {
            System.out.println(nameGeben()+" ist nicht dreckig.");
        }

    }
    public void xpsetzen(int xp)
    {
        erfahrung = xp;
    }

    public int HungerwertSetzen(Nahrung a)
    {
        if(a == null)
        {
            System.out.println("Nicht Verfügbar!");
            return 0;
        }
        if(a.AnzahlGeben() == 0)
        {
            System.out.println("'"+a.datenwertGeben()+"'| Nicht mehr vorhanden.");
            return 0;
        }
        int hungerwert = a.nährwertGeben();
        if(hungerwert > 5)
        {
            return Hungerwert = 5;
        }
        a.AnzahlMinusEins();
        return hungerwert;
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

