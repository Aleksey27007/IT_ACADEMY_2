package transport.transport.train.rolling_stock_of_the_train;

import transport.transport.train.Comfort;
import transport.transport.train.RailwayCarriage;

public class SmallCarriage extends RailwayCarriage {

  public SmallCarriage(String name, int passengerCapacity, double luggageCapacity,
      Comfort comfortLevel) {
    super(name, passengerCapacity, luggageCapacity, comfortLevel);
  }
}
