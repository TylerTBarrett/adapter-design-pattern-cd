/**
 * 
 * @author 2021 Tyler Barrett
 * An interface for all digital albums
 */

public interface DigitalAlbum {

    /**
     * Starts playing the album from the first index, moves forward by one when the song is played
     * @return A string denoting the current song being played
     */
    public String playFromBeginning();

    /**
     * Plays the current song at the indicated index
     * @param num the index at which the song will be played
     * @return A string denoting the current song being played
     */
    public String playSong(int num);

    /**
     * Will skip back to the previous song
     * @return A string denoting the song skipped back to, does not play the song
     */
    public String prevSong();

    /**
     * Increments the song index by one and plays the current song, if the song index is at the end
     * then the song index will be started at 0
     * @return A string denoting the song being played
     */
    public String nextSong();

    /**
     * Stops and ejects the CD, also resets the currentindex to 0
     * @return A string denoting the CD has been stopped and ejected
     */
    public String stop();

    /**
     * Pauses the current song
     * @return A string denoting the current song has been paused
     */
    public String pause();
}
