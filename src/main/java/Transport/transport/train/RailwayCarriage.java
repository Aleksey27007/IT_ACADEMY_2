package Transport.transport.train;


public class RailwayCarriage implements Comparable<RailwayCarriage> {

  private String name;
  private int passengerCapacity;
  private double luggageCapacity;
  private Comfort comfortLevel;

  public RailwayCarriage(String name, int passengerCapacity, double luggageCapacity,
      Comfort comfortLevel) {
    this.name = name;
    this.passengerCapacity = passengerCapacity;
    this.luggageCapacity = luggageCapacity;
    this.comfortLevel = comfortLevel;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPassengerCapacity() {
    return passengerCapacity;
  }


  public double getLuggageCapacity() {
    return luggageCapacity;
  }

  @Override
  public int compareTo(RailwayCarriage obj) {
    RailwayCarriage tmp = (RailwayCarriage) obj;
    if (this.comfortLevel.getLevel() < tmp.comfortLevel.getLevel()) {
      return -1;
    } else if (this.comfortLevel.getLevel() > tmp.comfortLevel.getLevel()) {
      return 1;
    }
    return 0;
  }

  @Override
  public String toString() {
    return "name: " + name +
        ", passengerCapacity: " + passengerCapacity +
        ", luggageCapacity: " + luggageCapacity +
        ", comfortLevel: " + comfortLevel;
  }
}
