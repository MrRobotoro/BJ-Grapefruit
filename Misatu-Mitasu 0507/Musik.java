import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class Musik
{
    private Clip Musik;
    private String[] Dateipfad;
    
    public Musik()
    {
        Dateipfad = new String[2];
        Dateipfad[0] = "E:/Projekte/Musik/M1O/GartenMusik.wav";
        Dateipfad[1] = "E:/Projekte/Musik/M1O/SpielzimmerMusik.wav";
    }

    public void startMusik(int i)
    {
        try{
            AudioInputStream AIS = AudioSystem.getAudioInputStream(new File(Dateipfad[i]));

            Musik = AudioSystem.getClip();
            Musik.open(AIS);    

            Musik.start();
            Musik.loop(Musik.LOOP_CONTINUOUSLY);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }    
    }
    
    public void stop()
    {
        Musik.stop();        
    }
    
    

}
