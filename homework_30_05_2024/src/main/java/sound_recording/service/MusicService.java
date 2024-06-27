package sound_recording.service;

import java.util.List;
import sound_recording.music.MusicStyles;
import sound_recording.music.Track;

public class MusicService {

  public void sortByStyle(List<Track> tracklist, MusicStyles style) {
    for (Track t : tracklist) {
      if (t.getStyle() == style) {
        System.out.println(t);
      }
    }
    for (Track t : tracklist) {
      if (t.getStyle() != style) {
        System.out.println(t);
      }
    }
    System.out.println();
  }

  public void findByRange(Double min, Double max, List<Track> tracklist) {
    for (int i = 0; i < tracklist.size(); i++) {
      if (tracklist.get(i).getDuration() >= min && tracklist.get(i).getDuration() <= max) {
        System.out.println(tracklist.get(i).toString());
      }
    }
  }
}
