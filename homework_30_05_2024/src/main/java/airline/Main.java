package airline;

import airline.aircraft.Aircraft;
import airline.aircraft.Airline;
import airline.aircraft.aircrafts.AircraftsEnum;
import java.util.List;

public class Main {
  /*
  * Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
  * Посчитать общую вместимость и грузоподъемность. Провести сортировку самолетов компании по дальности полета.
  * Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
   */

  public static void main(String[] args) {

    Airline airline = new Airline();

    airline.getListPlane(AircraftsEnum.PLANES);

    airline.printListPlanes();

    System.out.println(airline.getFullPassengerCapacity());

    System.out.println(airline.getFullBaggageCapacity());

    airline.sort();
    airline.printListPlanes();

    List<Aircraft> selectedPlanes = airline.getPlaneByFuelConsumption(2000, 3000);
    System.out.println("---------------------------------------");
    for (Aircraft plane : selectedPlanes) {
      System.out.println(plane);
    }

  }
}
