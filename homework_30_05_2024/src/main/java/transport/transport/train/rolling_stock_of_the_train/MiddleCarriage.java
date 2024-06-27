package transport.transport.train.rolling_stock_of_the_train;

import transport.transport.train.Comfort;
import transport.transport.train.RailwayCarriage;

public class MiddleCarriage extends RailwayCarriage {

  public MiddleCarriage(String name, int passengerCapacity, double luggageCapacity,
      Comfort comfortLevel) {
    super(name, passengerCapacity, luggageCapacity, comfortLevel);
  }
}
