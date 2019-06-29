import java.util.Scanner;
public class Spiel
{
    private RaumListe RListe;
    private Monster Mst;
    private Raum Standort;
    
    public Spiel(String MonsterName, String Schwierigkeitsgrad)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Wähle eine Spezies!");
        System.out.print("----");
        System.out.print("Ryuu: ");
        System.out.print("The fire on the tip of its tail is a measure of its life.");
        System.out.print("If healthy, its tail burns intensely.");
        System.out.print("----");
        System.out.print("Robu:");
        System.out.print(" It loves playing around, especially when water is involved");
        System.out.print("----");
        System.out.print(" Spezies eingeben: ");
        String Spezies = s.next();
        if (Spezies.equals("Ryuu"))
        {
            Mst = new Ryuu("Monstername");
        }
        else if(Spezies.equals("Robu"))
        {
            Mst = new Robu("Monstername");
        }
        else
        {
            System.out.print("Keine bekannte Spezies");
        

        
        
    }
    

}
public void Spezies_Auswählen()
{
    
}
}