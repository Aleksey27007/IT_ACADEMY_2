package taxi_company.transport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import taxi_company.transport.passenger_cars.PassengerCarsEnum;

public class TaxiCompany {
  private List<Car> carList;

  public TaxiCompany() {
    this.carList = new ArrayList<>();
  }

  public List<Car> getCarList(PassengerCarsEnum cars) {
    for (int i = 0; i < cars.getCars().length; i++) {
      carList.add(cars.getCars()[i]);
    }
    return carList;
  }

  public void printCarList() {
    System.out.println("Cars: ");
    for (Car car : carList) {
      System.out.println(car);
    }
  }

  public double getCostOfTaxiCompanyCars() {
    double fullCost = 0;
    for (int i = 0; i < carList.size(); i++) {
      fullCost += carList.get(i).getCarCost();
    }
    return fullCost;
  }

  public void sort() {
    carList.sort(Comparator.<Car> reverseOrder());
  }

  public List<Car> getCarByMaxSpeed(double min, double max){
    List<Car> carsSelected = new ArrayList<>();
    for (Car car : carList) {
      if(car.getCarMaxSpeed() >= min && car.getCarMaxSpeed() <= max){
        carsSelected.add(car);
      }
    }
    return carsSelected;
  }

}
