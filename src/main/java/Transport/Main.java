package Transport;

import Transport.transport.train.RailwayCarriage;
import Transport.transport.train.train_tools.Train;
import Transport.transport.train.train_tools.Trains;
import java.util.List;

public class Main {
  /*
  * Транспорт. Определить иерархию подвижного состава железнодорожного транспорта. Создать пассажирский поезд.
  * Посчитать общую численность пассажиров и багажа. Провести сортировку вагонов поезда на основе уровня комфортности.
  * Найти вагоны в поезде, соответствующие заданному диапазону параметров числа пассажиров.
  */
  public static void main(String[] args) {
    Train train = new Train();

    /** passengers train **/
    train.getTrainList(Trains.PASSENGER_TRAIN);
    train.printTrainList();

    /** total passengers, total luggage **/
    System.out.println("Total passengers: " + train.calculateTheTotalNumberOfPassangers());
    System.out.println("Total passengers: " + train.calculateTheTotalWeightOfLuggage());

    /** sort by comfort level **/
    train.sort();
    train.printTrainList();

    /** search by params **/
    List<RailwayCarriage> selectedCarriage = train.getCarriageByRangeOfPassengers(10, 21);
    System.out.println("---------------------------------------");
    for (RailwayCarriage carriage : selectedCarriage) {
      System.out.println(carriage);
    }
  }
}
