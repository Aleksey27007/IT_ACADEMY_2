package Transport.transport.train.train_tools;

import Transport.transport.train.RailwayCarriage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Train {
  private List<RailwayCarriage> train;

  public Train() {
    this.train = new ArrayList<>();
  }

  public List<RailwayCarriage> getTrainList(Trains train) {
    for (int i = 0; i < train.getPassengerTrain().length; i++) {
      this.train.add(train.getPassengerTrain()[i]);
    }
    return this.train;
  }

  public void printTrainList() {
    System.out.println("Train: ");
    for (RailwayCarriage carriage : train) {
      System.out.println(carriage);
    }
  }

  public int calculateTheTotalNumberOfPassangers() {
    int total = 0;
    for (int i = 0; i < train.size(); i++) {
      total += train.get(i).getPassengerCapacity();
    }
    return total;
  }

  public int calculateTheTotalWeightOfLuggage() {
    int total = 0;
    for (int i = 0; i < train.size(); i++) {
      total += train.get(i).getLuggageCapacity();
    }
    return total;
  }

  public void sort() {
    train.sort(Comparator.<RailwayCarriage> reverseOrder());
  }

  public List<RailwayCarriage> getCarriageByRangeOfPassengers(int min, int max){
    List<RailwayCarriage> totalPassengers = new ArrayList<>();
    for (RailwayCarriage carriage : train) {
      if(carriage.getPassengerCapacity() >= min && carriage.getPassengerCapacity() <= max){
        totalPassengers.add(carriage);
      }
    }
    return totalPassengers;
  }
}
