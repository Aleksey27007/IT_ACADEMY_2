package play_room;

import java.util.List;
import play_room.rooms.play_room.PlayRoom;
import play_room.rooms.play_room.toys.Toy;
import play_room.rooms.play_room.toys.ToysEnum;

public class Main {
  /*
  *  Игровая комната. Подготовить игровую комнату для детей разных возрастных групп. Игрушек должно
  * быть фиксированное количество в пределах выделенной суммы денег. Должны встречаться игрушки родственных групп, н-р:
  * маленькие, средние и большие машины, куклы, мячи, кубики. Провести сортировку игрушек в комнате по одному из параметров.
  * Найти игрушки в комнате, соответствующие заданному диапазону параметров.
  */
  public static void main(String[] args) {
    PlayRoom playRoom = new PlayRoom("PlayRoom");

    playRoom.fillTheRoom(ToysEnum.TOYS);
    playRoom.printToysInTheRoom();

    playRoom.sortToysByName();
    playRoom.printToysInTheRoom();

    List<Toy> toys = playRoom.findToys("Ball", 320, 470);
    for (Toy toy: toys) {
      System.out.println(toy);
    }
  }
}
