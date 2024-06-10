package sound_recording.disc;

import static sound_recording.music.MusicStyles.*;

import java.util.ArrayList;
import java.util.List;
import sound_recording.music.Track;
import sound_recording.service.MusicService;

public class Disc {
  private List<Track> tracklist;
  private MusicService service;

  public Disc() {
    this.tracklist = new ArrayList<>();
    this.service = new MusicService();
  }

  public List<Track> burnTracksToDisc() {
    tracklist.add(new Track("Rammstein - Sonne", 4.12, METAL));
    tracklist.add(new Track("Rammstein - Deutschland", 9.22, METAL));
    tracklist.add(new Track("Metallica - Enter Sandman", 5.31, ROCK));
    tracklist.add(new Track("Nickback - Hero ", 3.21, ROCK));
    tracklist.add(new Track("Shakira - Waka waka ", 3.22, POP));
    tracklist.add(new Track("Kush Kush - Fight Back With Love Tonight", 3.33, ELECTRONIC));
    tracklist.add(new Track("Led Zeppelin - Whole Lotta Love", 4.35, ROCK));
    return tracklist;
  }

  public void showDuration() {
    double durationTracksOnDisc = 0;
    for (int i = 0; i < tracklist.size(); i++) {
      durationTracksOnDisc += tracklist.get(i).getDuration();
    }
    System.out.printf("Disc duration: %.2f \n", durationTracksOnDisc);
  }

  public void printTrackList() {
    for (Track track : tracklist) {
      System.out.println(track);
    }
  }
  public List<Track> getTracklist() {
    return tracklist;
  }

  public void setTracklist(List<Track> tracklist) {
    this.tracklist = tracklist;
  }

  public MusicService getService() {
    return service;
  }

  public void setService(MusicService service) {
    this.service = service;
  }


}
