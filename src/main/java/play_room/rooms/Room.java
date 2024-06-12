package play_room.rooms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import play_room.age_category.CategoryEnum;
import play_room.rooms.play_room.toys.Toy;

public class Room{
  private String nameRoom;
  private List<Toy> toys;
  private List<CategoryEnum> childrenCategory;
  private final double price = 4000;

  public Room(String nameRoom) {
    this.nameRoom = nameRoom;
    this.toys = new ArrayList<>();
    this.childrenCategory = new ArrayList<>();
  }

  public String getNameRoom() {
    return nameRoom;
  }

  public void setNameRoom(String nameRoom) {
    this.nameRoom = nameRoom;
  }

  public List<Toy> getToys() {
    return toys;
  }

  public void setToys(List<Toy> toys) {
    this.toys = toys;
  }

  public List<CategoryEnum> getChildrenCategory() {
    return childrenCategory;
  }

  public void setChildrenCategory(List<CategoryEnum> childrenCategory) {
    this.childrenCategory = childrenCategory;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Room{" +
        "nameRoom='" + nameRoom + '\'' +
        ", toys=" + toys +
        ", childrenCategory=" + childrenCategory +
        ", price=" + price +
        '}';
  }
}
