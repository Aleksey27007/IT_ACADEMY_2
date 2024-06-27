package play_room.rooms.play_room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import play_room.rooms.Room;
import play_room.rooms.play_room.toys.Toy;
import play_room.rooms.play_room.toys.ToysEnum;

public class PlayRoom extends Room {


  public PlayRoom(String nameRoom) {
    super(nameRoom);
  }

  public void fillTheRoom(ToysEnum toys) {
    double price = super.getPrice();
    int i = 0;
    for (;;) {
      if (price > 0) {
        super.getToys().add(toys.getToys()[i]);
        price -= toys.getToys()[i].getPrice();
        i++;
        if (i == toys.getToys().length) {
          i = 0;
        }
      } else {
        break;
      }
    }
  }

  public void sortToysByName() {
    Collections.sort(super.getToys(), new Comparator<Toy>() {
      @Override
      public int compare(Toy o1, Toy o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
  }

  public List<Toy> findToys(String toyName, double costMin, double costMax) {
    List<Toy> toys = new ArrayList<>();
    for (Toy toy : super.getToys()) {
      if (toyName.equals(toy.getName()) && costMin <= toy.getPrice() &&
          costMax >= toy.getPrice()) {
        toys.add(toy);
      }
    }
    return toys;
  }

  public void printToysInTheRoom() {
    System.out.println("---------------------------------------------");
    for (Toy toy : super.getToys()) {
      System.out.println(toy);
    }
  }

}
