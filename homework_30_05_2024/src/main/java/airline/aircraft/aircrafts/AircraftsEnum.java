package airline.aircraft.aircrafts;

import airline.aircraft.Aircraft;

public enum AircraftsEnum {

  PLANES(new Aircraft[] {
      new Plane("Airbus-A330", 440, 8800, 10800, 2500),
      new Plane("Airbus-A380", 853, 17600, 15200, 13000),
      new Plane("Boeing 737", 132, 8800, 10800, 2650),
      new Plane("Boeing 747", 524, 8800, 12300, 2650),
  });

  private Aircraft[] planes;

  AircraftsEnum(Aircraft[] planes) {
    this.planes = planes;
  }

  public Aircraft[] getPlanes() {
    return planes;
  }

  public void setPlanes(Aircraft[] planes) {
    this.planes = planes;
  }
}
