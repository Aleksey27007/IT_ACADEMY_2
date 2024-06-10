package sound_recording;

import static sound_recording.music.MusicStyles.ROCK;

import sound_recording.disc.Disc;

public class Main {
  /*
  * Звукозапись. Определить иерархию музыкальных композиций. Записать на диск сборку. Посчитать продолжительность.
  * Провести перестановку композиций диска на основе принадлежности к стилю. Найти композицию,
  * соответствующую заданному диапазону длины треков.*/

  public static void main(String[] args) {

    Disc disc = new Disc();

    /** burn list of tracks **/
    disc.burnTracksToDisc();
    disc.printTrackList();

    /** calculate duration **/
    disc.showDuration();

    /** replace track by style **/
    disc.getService().sortByStyle(disc.getTracklist(), ROCK);

    /** find by track duration **/
    disc.getService().findByRange(2.0, 4.0, disc.getTracklist());
  }
}
