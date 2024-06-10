package Transport.transport.train.rolling_stock_of_the_train;

import Transport.transport.train.Comfort;
import Transport.transport.train.RailwayCarriage;

public class MiddleCarriage extends RailwayCarriage {

  public MiddleCarriage(String name, int passengerCapacity, double luggageCapacity,
      Comfort comfortLevel) {
    super(name, passengerCapacity, luggageCapacity, comfortLevel);
  }
}
