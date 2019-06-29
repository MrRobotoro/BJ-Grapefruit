
public class RaumListe
{
  private Listenelement erster;
  
  public RaumListe()
  {
      erster = new Abschluss();
      
      Raum Spielraum = new Spielzimmer("Spielzimmer");
      Raum Garten = new Garten("Garten");
      
      erster.hintenAnfuegen(Spielraum);
      erster.hintenAnfuegen(Garten);
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
  
}
