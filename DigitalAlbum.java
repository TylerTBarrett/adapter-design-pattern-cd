/**
 * 
 * @author 2021 Tyler Barrett
 * An interface for all digital albums
 */

public interface DigitalAlbum {
    public String playFromBeginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
