package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}
	
	// add track
	public void addTrack(Track track) {
		boolean check = false;
		for (Track check_track: tracks) {
			if (check_track == track) {
				System.out.println("That track has already been!");
				check = true;
			}
		}
		if (check == false) {
			System.out.println("That track has added!");
			tracks.add(track);
		}
	}
	
	// remove track
	public void removeAuthor(Track track) {
		boolean check = false;
		for (Track check_track: tracks) {
			if (check_track == track){
				System.out.println("That track has removed!");
				check = true;
			}
		}
		if (check = true) {
			tracks.remove(track);
		}
		else {
			System.out.println("That track is not exist!");
		}
	}
	
	public int getLength() {
		int sum_length = 0;
		for (Track track: tracks) {
			sum_length += track.getLength();
		}
		return sum_length;
	}
	
	//implement playable
	public void play() {
		for (Track track: tracks) {
			System.out.println("Playing DVD: " + track.getTitle());
			System.out.println("DVD length: " + track.getLength());
		}
	
	}

}

