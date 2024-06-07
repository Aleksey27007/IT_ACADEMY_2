package home_electrical_appliances.appliances;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HomeAppliences {
  private ArrayList<AbstractHomeAppliences> homeAppliencesArrayList;

  public HomeAppliences(ArrayList<AbstractHomeAppliences> homeAppliencesArrayList) {
    this.homeAppliencesArrayList = homeAppliencesArrayList;
  }

  public void printHomeAppliencesList() {
    for (AbstractHomeAppliences homeApplience : homeAppliencesArrayList) {
      System.out.println(homeApplience);
    }
  }

  public int calculateWattage() {
    int wattageSum = 0;
    for (int i = 0; i < homeAppliencesArrayList.size(); i++) {
      if (homeAppliencesArrayList.get(i).isPlugIntoASocket()) {
        wattageSum += homeAppliencesArrayList.get(i).getWattage();
      }
    }
    return wattageSum;
  }

  public void sortByWattage() {
    Collections.sort(homeAppliencesArrayList, new Comparator<AbstractHomeAppliences>() {
      @Override
      public int compare(AbstractHomeAppliences o1, AbstractHomeAppliences o2) {
        return o1.getWattage() - o2.getWattage();
      }
    });
  }
}
