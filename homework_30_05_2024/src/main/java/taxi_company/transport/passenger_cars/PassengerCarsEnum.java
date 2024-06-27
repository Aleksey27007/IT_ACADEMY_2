package taxi_company.transport.passenger_cars;

import taxi_company.transport.Car;

public enum PassengerCarsEnum {

  CARS(new Car[] {
      new PassengerCar("Renault LOGAN 2024", 175, 53900, 4),
      new PassengerCar("Geely Collray 2021", 185, 67000, 5.5),
      new PassengerCar("Geely Emgrand 2 2023", 175, 54000, 5.0),
      new PassengerCar("Audi A8 D5 2020",270,  252000, 11),
  });

  private Car[] cars;

  PassengerCarsEnum(Car[] cars) {
    this.cars = cars;
  }

  public Car[] getCars() {
    return cars;
  }

  public void setCars(Car[] cars) {
    this.cars = cars;
  }
}
