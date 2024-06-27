package play_room.rooms.play_room.toys;

public class Toy {
  private String name;
  private double price;
  private ToySizeEnum size;

  public Toy(String name, double price, ToySizeEnum size) {
    this.name = name;
    this.price = price;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Toy " +
        "name: " + name +
        ", price: " + price;
  }


}
