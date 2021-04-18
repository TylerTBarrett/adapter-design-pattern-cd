/**
 * 
 * @author 2021 Tyler Barrett
 * A digital representation of a digital album with functionality
 */

import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentindex;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        currentindex = songs.size();
    }

    public String playFromBeginning() {
        currentindex = 0;
        return "Playing song " + (currentindex + 1) + ": " + songs.get(currentindex++);
    }

    public String playSong(int num) {
        if (num < 0 || num >= songs.size()) {
            return "Not a valid song number";
        }
        currentindex = num;
        return "Playing: " + (currentindex + 1) + ": " + ((currentindex < songs.size() - 1) ? songs.get(currentindex++) : songs.get(currentindex = 0));
    }

    public String prevSong() {
        return "Skipping back and playing: " + ((currentindex > 0) ? songs.get(currentindex--) : songs.get(currentindex));
    }

    public String nextSong() {
        /*if (currentindex < songs.size() - 1) {
            return "Playing: " + (currentindex + 1) + ": " + songs.get(currentindex++);
        }
        int temp = currentindex;
        currentindex = 0;
        return "Playing: " + (temp + 1) + ": " + songs.get(temp);*/

        if (currentindex < songs.size() - 1) {
            currentindex++;
        } else {
            currentindex = 0;
        }
        return "Playing: " + (currentindex + 1) + ": " + songs.get(currentindex); // Written as described
    }

    public String stop() {
        currentindex = 0;
        return "Stopping CD and ejecting";
    }

    @Override
    public String pause() {
        return "Pausing song " + (currentindex + 1);
    }
    
}
