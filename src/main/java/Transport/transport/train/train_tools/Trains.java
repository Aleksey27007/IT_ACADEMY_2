package Transport.transport.train.train_tools;

import Transport.transport.train.Comfort;
import Transport.transport.train.RailwayCarriage;
import Transport.transport.train.rolling_stock_of_the_train.LargeCarriage;
import Transport.transport.train.rolling_stock_of_the_train.MiddleCarriage;
import Transport.transport.train.rolling_stock_of_the_train.SmallCarriage;

public enum Trains {
  PASSENGER_TRAIN(new RailwayCarriage[]{
      new SmallCarriage("Coupe10", 20, 1000, Comfort.FIRST_CLASS),
      new SmallCarriage("Coupe8", 16, 900, Comfort.FIRST_CLASS),
      new MiddleCarriage("Coupe16", 32, 480, Comfort.FIRST_CLASS),
      new MiddleCarriage("Coupe18", 36, 540, Comfort.FIRST_CLASS),
      new LargeCarriage("Seating54", 54, 810, Comfort.SECOND_CLASS),
      new LargeCarriage("Seating54", 54, 810, Comfort.SECOND_CLASS),
  });

  private RailwayCarriage[] passengerTrain;

  Trains(RailwayCarriage[] passengerTrain) {
    this.passengerTrain = passengerTrain;
  }

  public RailwayCarriage[] getPassengerTrain() {
    return passengerTrain;
  }
}
