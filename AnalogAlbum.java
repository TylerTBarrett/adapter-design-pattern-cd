/**
 * 
 * @author 2021 Tyler Barrett
 * Interface for all Analog Albums
 */

public interface AnalogAlbum {

    /**
     * Plays the current song, and increments the currentindex by 1
     * @return A string indicating current song being played
     */
    public String play();

    /**
     * Reduces the currentindex of the Album by 1
     * @return A string indicating what index the Album is on
     */
    public String rewind();

    /**
     * Increases current index by 1
     * @return A String indicating by index the currentindex variable is at
     */
    public String ffwd();

    /**
     * Pauses the current song
     * @return A string indicating that the song has been paused
     */
    public String pause();

    /**
     * Returns a string indicating that the album has been stopped and ejecteda
     * @return A string indicating that the album has been stopped and ejected
     */
    public String stopEject();
}