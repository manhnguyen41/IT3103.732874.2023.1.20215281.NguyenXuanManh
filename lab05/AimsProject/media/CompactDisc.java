package lab05.AimsProject.media;

import lab05.AimsProject.exception.PlayerException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    // Attribute
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    // Constructor
    public CompactDisc(int id, String title, String category, float cost,
                       String director, int length, String artist) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
    }

    // Method to add a track
    public void addTrack(Track track) throws Exception {
        int indexOfTrack = tracks.indexOf(track);
        if (indexOfTrack == -1) {
            throw new Exception("Track is already in the list");
        }
        tracks.add(track);
        System.out.println("Added");
    }

    // Method to remove a track
    public void removeTrack(Track track) throws Exception {
        int indexOfTrack = tracks.indexOf(track);
        if (indexOfTrack == -1) {
            throw new Exception("Track is absent in the list");
        }
        tracks.remove(indexOfTrack);
        System.out.println("Removed");
    }

    // Method to get the length of CD
    @Override
    public int getLength() {
        int length = 0;
        for (Track track: tracks) {
            length += track.getLength();
        }
        setLength(length);
        return length;
    }

    // Method to play a track
    @Override
    public void play() throws PlayerException {
        if(this.getLength() > 0) {
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD artist: " + artist);
            System.out.println("CD length: " + this.getLength());
            for (Track track: tracks) {
                track.play();
            }
            Iterator<Track> iter = tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()) {
                nextTrack = (Track) iter.next();
                try {
                    nextTrack.play();
                } catch (PlayerException e) {
                    throw e;
                }
            }
        } else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
    }

    // Method to print a cd
    @Override
    public void print() {
        System.out.println(getId() + ". CD - "
                + getTitle() + " - "
                + getCategory() + " - "
                + getDirector() + " - "
                + artist + " - "
                + getLength() + ": "
                + getCost() + "$");
    }

    // Getter and Setter
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
