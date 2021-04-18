/**
 * 
 * @author 2021 Tyler Barrett
 * Adapts DigitalAlbums to AnalogAlbums
 */

public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    /**
     * Constructs an AnalogAdapter based on the inputted digital album to be adapted
     * @param album is the album that will be adapted
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * Plays the next song, moving the song index forward one prior to playing it
     * @return The song that will be played
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * Rewinds by one index
     * @return The current song index
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Plays the next song, moving the song index forward one prior to playing it
     * @return The song that will be played
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Pauses the song
     * @return A string indicating the song is paused
     */
    public String pause() {
        return album.pause();
    }

    /**
     * Stops playing the CD and ejects it
     * @return a String indicating that the CD has been ejected
     */
    public String stopEject() {
        return album.stop();
    }
}
