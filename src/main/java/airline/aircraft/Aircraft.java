package airline.aircraft;

import biker.equipment.Equipment;

public class Aircraft implements Comparable<Aircraft> {
  private String name;
  private int passengerCapacity;
  private double baggageCapacity;
  private double flightRange;
  private double fuelConsumption;

  public Aircraft(String name, int passengerCapacity, double baggageCapacity, double flightRange,
      double fuelConsumption) {
    this.name = name;
    this.passengerCapacity = passengerCapacity;
    this.baggageCapacity = baggageCapacity;
    this.flightRange = flightRange;
    this.fuelConsumption = fuelConsumption;
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

  public void setPassengerCapacity(int passengerCapacity) {
    this.passengerCapacity = passengerCapacity;
  }

  public double getBaggageCapacity() {
    return baggageCapacity;
  }

  public void setBaggageCapacity(double baggageCapacity) {
    this.baggageCapacity = baggageCapacity;
  }

  public double getFlightRange() {
    return flightRange;
  }

  public void setFlightRange(double flightRange) {
    this.flightRange = flightRange;
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
        ", passengerCapacity: " + passengerCapacity +
        ", baggageCapacity: " + baggageCapacity +
        ", flightRange: " + flightRange +
        ", fuelConsumption: " + fuelConsumption;
  }

  @Override
  public int compareTo(Aircraft obj) {
    Aircraft tmp = obj;
    if (this.flightRange < tmp.flightRange) {
      return -1;
    } else if (this.flightRange > tmp.flightRange) {
      return 1;
    }
    return 0;
  }
}
