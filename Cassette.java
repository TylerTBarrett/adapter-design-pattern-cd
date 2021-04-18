/**
 * 
 * @author 2021 Tyler Barrett
 * A digital representation of a Cassette and it's functions
 */

 import java.util.ArrayList;

public class Cassette implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentindex;

    /**
     * Constructs a new Cassette based on the five inputted Strings
     * @param song1 String indicating song at index 0
     * @param song2 String indicating song at index 1
     * @param song3 String indicating song at index 2
     * @param song4 String indicating song at index 3
     * @param song5 String indicating song at index 4
     */
    public Cassette(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        currentindex = 0;
    }

    public String play() {
        if (currentindex < songs.size()) {
            return "Playing song " + (currentindex + 1) + ": " + songs.get(currentindex++);
        }
        return "At the end of the cassett you need to rewind";
    }

    public String rewind() {
        return (currentindex > 0) ? "Rewinding to song " + (currentindex--) : "Fully Re-Wound";
    }

    public String ffwd() {
        if (currentindex == (songs.size() - 1)) {
            return "At the end of the cassett you need to rewind";
        } else if (currentindex == (songs.size() - 2)) {
            currentindex++;
            return "Forwarded to the end of the cassett";
        }
        currentindex++;
        return "Forwarding to song " + (currentindex + 1);

    }

    public String pause() {
        return "Pausing " + songs.get(currentindex);
    }

    public String stopEject() {
        return "Stopping cassett and ejecting";
    }


}
