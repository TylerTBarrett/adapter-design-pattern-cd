/**
 * 
 * @author 2021 Tyler Barrett
 * A digital representation of a Cassette and it's functions
 */

 import java.util.ArrayList;

public class Cassette implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentindex;

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
            return "Playing song " + (currentindex + 1) + ":" + songs.get(currentindex);
        }
        return "At the end of the cassett you need to rewind";
    }

    public String rewind() {
        return (currentindex > 0) ? "Rewinding to song " + (currentindex--) : "Fully Re-Wound";
    }

    @Override
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

    @Override
    public String pause() {
        return "Pausing " + songs.get(currentindex);
    }

    @Override
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }


}