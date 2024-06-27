package home_electrical_appliances.appliances;

import java.util.ArrayList;

public abstract class AbstractHomeAppliences {

  private String name;
  private String model;
  private int wattage;
  private boolean plugIntoASocket;

  public AbstractHomeAppliences(String name, String model, int wattage) {
    this.name = name;
    this.model = model;
    this.wattage = wattage;
    this.plugIntoASocket = false;
  }

  public boolean isPlugIntoASocket() {
    return plugIntoASocket;
  }

  public void setPlugIntoASocket(boolean plugIntoASocket) {
    this.plugIntoASocket = plugIntoASocket;
  }

  public void turnOn() {
    if (isPlugIntoASocket()) {
      System.out.println("The " + this.name + " is ready for use!");
    } else {
      System.out.println("Need plug into socket!");
    }
  }

  public void turnOff() {
    if (!isPlugIntoASocket()) {
      System.out.println("The " + this.name + " is off!");
    } else {
      System.out.println("Need unplug!");
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getWattage() {
    return wattage;
  }

  public void setWattage(int wattage) {
    this.wattage = wattage;
  }

  @Override
  public String toString() {
    return "AbstractHomeAppliences{" +
        "name: '" + name + '\'' +
        ", model: '" + model + '\'' +
        ", wattage: " + wattage +
        ", plug into a socket: " + plugIntoASocket +
        '}';
  }
}
