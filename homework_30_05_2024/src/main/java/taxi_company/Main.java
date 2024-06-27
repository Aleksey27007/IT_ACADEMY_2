package taxi_company;

import java.util.List;
import taxi_company.transport.Car;
import taxi_company.transport.TaxiCompany;
import taxi_company.transport.passenger_cars.PassengerCarsEnum;

public class Main {
  /*
  * Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк.
  * Посчитать стоимость автопарка. Провести сортировку автомобилей парка по расходу топлива. Найти автомобиль в компании,
  * соответствующий заданному диапазону параметров скорости.
   */

  public static void main(String[] args) {

    TaxiCompany taxiCompany = new TaxiCompany();

    taxiCompany.getCarList(PassengerCarsEnum.CARS);

    taxiCompany.printCarList();

    System.out.println(taxiCompany.getCostOfTaxiCompanyCars());

    taxiCompany.sort();
    taxiCompany.printCarList();

    List<Car> selectedCars = taxiCompany.getCarByMaxSpeed(170, 180);
    System.out.println("---------------------------------------");
    for (Car car : selectedCars) {
      System.out.println(car);
    }

  }
}
