package airline.aircraft;

import airline.aircraft.aircrafts.AircraftsEnum;
import biker.equipment.Equipment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
  private List<Aircraft> aircrafttList;

  public Airline() {
    this.aircrafttList = new ArrayList<>();
  }

  public List<Aircraft> getListPlane(AircraftsEnum planes) {
    for (int i = 0; i < planes.getPlanes().length; i++) {
      aircrafttList.add(planes.getPlanes()[i]);
    }
    return aircrafttList;
  }

  public void printListPlanes() {
    System.out.println("Planes: ");
    for (Aircraft plane : aircrafttList) {
      System.out.println(plane);
    }
  }

  public double getFullPassengerCapacity() {
    double fullCapacity = 0;
    for (int i = 0; i < aircrafttList.size(); i++) {
      fullCapacity += aircrafttList.get(i).getPassengerCapacity();
    }
    return fullCapacity;
  }

  public double getFullBaggageCapacity() {
    double fullCapacity = 0;
    for (int i = 0; i < aircrafttList.size(); i++) {
      fullCapacity += aircrafttList.get(i).getBaggageCapacity();
    }
    return fullCapacity;
  }
  public void sort() {
    aircrafttList.sort(Comparator.<Aircraft> reverseOrder());
  }

  public List<Aircraft> getPlaneByFuelConsumption(double min, double max){
    List<Aircraft> planeSelected = new ArrayList<>();
    for (Aircraft plane : aircrafttList) {
      if(plane.getFuelConsumption() >= min && plane.getFuelConsumption() <= max){
        planeSelected.add(plane);
      }
    }
    return planeSelected;
  }

}
