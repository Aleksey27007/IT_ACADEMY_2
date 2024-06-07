package home_electrical_appliances;

import home_electrical_appliances.appliances.AbstractHomeAppliences;
import home_electrical_appliances.appliances.HomeAppliences;
import home_electrical_appliances.appliances.large.ElectricCooker;
import home_electrical_appliances.appliances.large.TV;
import home_electrical_appliances.appliances.large.WashingMachine;
import home_electrical_appliances.appliances.small.Computer;
import home_electrical_appliances.appliances.small.Hairdryer;
import home_electrical_appliances.appliances.small.PressureCooker;
import java.util.ArrayList;

public class Main {

  /*
  Домашние электроприборы. Определить иерархию электроприборов. Включить некоторые в розетку.
  Посчитать потребляемую мощность. Провести сортировку приборов в квартире на основе мощности.
  Найти прибор в квартире, соответствующий заданному диапазону параметров.
  */
  public static void main(String[] args) {
    ArrayList<AbstractHomeAppliences> homeAppliencesList = new ArrayList<>();

    ElectricCooker electricCooker = new ElectricCooker("Electric Cooker", "Beko FFSS62010GB", 3000);
    homeAppliencesList.add(electricCooker);

    Computer computer = new Computer("Computer", "ASUS TUF GAMING FX505", 200);
    homeAppliencesList.add(computer);

    WashingMachine washer = new WashingMachine("WashingMachine", "LG F2V5HS0W", 2500);
    homeAppliencesList.add(washer);

    Hairdryer hairdryer = new Hairdryer("Hairdryer", "ROWENTA", 2000);
    homeAppliencesList.add(hairdryer);

    PressureCooker pressureCooker = new PressureCooker("Pressure cooker", "Midea", 700);
    homeAppliencesList.add(pressureCooker);

    TV tv = new TV("TV", "TCL 55P635", 50);
    homeAppliencesList.add(tv);

    /** repeat to view changes in outlet connection status **/
    electricCooker.turnOn();
    electricCooker.setPlugIntoASocket(true);
    electricCooker.turnOn();

    pressureCooker.setPlugIntoASocket(true);
    tv.setPlugIntoASocket(true);

    /** checking work status **/
    HomeAppliences homeAppliences = new HomeAppliences(homeAppliencesList);
    homeAppliences.printHomeAppliencesList();

//    electricCooker.turnOff();
//    electricCooker.setPlugIntoASocket(false);
//    electricCooker.turnOff();

    /** power consumption **/
    System.out.println("Power consumption: " + homeAppliences.calculateWattage());

    /** sort by wattage **/
    homeAppliences.sortByWattage();
    homeAppliences.printHomeAppliencesList();

  }
}
