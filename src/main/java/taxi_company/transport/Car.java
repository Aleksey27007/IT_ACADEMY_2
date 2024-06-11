package taxi_company.transport;

public class Car implements Comparable<Car> {
  private String name;
  private int carMaxSpeed;
  private double carCost;
  private double fuelConsumption;

  public Car(String name, int carSpeed, double carCost, double fuelConsumption) {
    this.name = name;
    this.carMaxSpeed = carSpeed;
    this.carCost = carCost;
    this.fuelConsumption = fuelConsumption;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCarMaxSpeed() {
    return carMaxSpeed;
  }

  public void setCarMaxSpeed(int carMaxSpeed) {
    this.carMaxSpeed = carMaxSpeed;
  }

  public double getCarCost() {
    return carCost;
  }

  public void setCarCost(double carCost) {
    this.carCost = carCost;
  }

  public double getFuelConsumption() {
    return fuelConsumption;
  }

  public void setFuelConsumption(double fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }

  @Override
  public String toString() {
    return "name: " + name +
        ", carMaxSpeed: " + carMaxSpeed +
        ", carCost: " + carCost +
        ", fuelConsumption: " + fuelConsumption;
  }

  @Override
  public int compareTo(Car obj) {
    Car tmp = obj;
    if (this.fuelConsumption < tmp.fuelConsumption) {
      return -1;
    } else if (this.fuelConsumption > tmp.fuelConsumption) {
      return 1;
    }
    return 0;
  }
}
