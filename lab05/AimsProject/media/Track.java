package lab05.AimsProject.media;

import lab05.AimsProject.exception.PlayerException;

public class Track implements Playable{
    // Attribute
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Method to play a track
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing track: " + title);
            System.out.println("Track length : " + length);
        } else {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Track track) {
            return title.equals(track.getTitle()) && length == track.getLength();
        }
        return false;
    }

    // Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
