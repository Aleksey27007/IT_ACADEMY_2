package Transport.transport.train.rolling_stock_of_the_train;

import Transport.transport.train.Comfort;
import Transport.transport.train.RailwayCarriage;

public class SmallCarriage extends RailwayCarriage {

  public SmallCarriage(String name, int passengerCapacity, double luggageCapacity,
      Comfort comfortLevel) {
    super(name, passengerCapacity, luggageCapacity, comfortLevel);
  }
}
