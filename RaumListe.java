
public class RaumListe
{
  private Listenelement erster;
  
  public RaumListe()
  {
      erster = new Abschluss();
      
      Raum Playroom = new Spielzimmer("Spielzimmer");
      Raum Garden = new Garten("Garten");
      
      erster.hintenAnfuegen(Playroom);
      erster.hintenAnfuegen(Garden);
  }
  
  public Listenelement ersterGeben()
  {
      return erster;
    }
  public void RaumAnzahlGeben()
  {
      int RaumANZ = erster.anzahlDatenknotenGeben();
      System.out.println("Raumanzahl: "+RaumANZ);
      System.out.print("----");         
  }
  
  public void RaumlisteAusgeben()
  {
      erster.listenDatenAusgeben();
  }
  
  public Raum RaumGeben()
  {
      return erster.naechsterGeben().inhaltGeben();
  }
}
