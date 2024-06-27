package biker.ammunition;

import biker.equipment.Equipment;
import biker.equipment.biker_equipment.BikerBoots;
import biker.equipment.biker_equipment.BikerElbowPads;
import biker.equipment.biker_equipment.BikerGloves;
import biker.equipment.biker_equipment.BikerHelm;
import biker.equipment.biker_equipment.BikerKneePads;
import biker.equipment.biker_equipment.BikerMotorcycleJacket;

public enum AllAmmunitionEnum {
  BIKER(new Equipment[] {
      new BikerBoots("ICON Boot Sacred Black", 1400, 515),
      new BikerHelm("GS Pure BMW", 1300, 3024),
      new BikerElbowPads("ALPINESTARS BIONIC PLUS BLACK", 300, 176),
      new BikerGloves("Alpinestars SMX-1 Air V2 Gloves", 315, 490),
      new BikerKneePads("ALPINESTARS BIONIC ACTION BLACK/RED OS", 340, 176),
      new BikerMotorcycleJacket("Forward Movement HD3", 1950, 950)
  });


  private Equipment[] equipment;

  AllAmmunitionEnum(Equipment[] equipment) {
    this.equipment = equipment;
  }

  public Equipment[] getEquipment() {
    return equipment;
  }

  public void setEquipment(Equipment[] equipment) {
    this.equipment = equipment;
  }
}
