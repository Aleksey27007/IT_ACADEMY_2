package home_electrical_appliances.appliances.small;

import home_electrical_appliances.appliances.AbstractHomeAppliences;

public abstract class SmallHouseholdAppliances extends AbstractHomeAppliences {

  public SmallHouseholdAppliances(String name, String model, int wattage) {
    super(name, model, wattage);
  }
}
