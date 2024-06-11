package airline.aircraft.aircrafts;

import airline.aircraft.Aircraft;

public class Plane extends Aircraft {

  public Plane(String name, int passengerCapacity, double baggageCapacity, double flightRange,
      double fuelConsumption) {
    super(name, passengerCapacity, baggageCapacity, flightRange, fuelConsumption);
  }
}
