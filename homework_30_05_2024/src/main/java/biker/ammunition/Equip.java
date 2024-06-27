package biker.ammunition;

import biker.equipment.Equipment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equip {
  private List<Equipment> equipmentList;

  public Equip() {
    this.equipmentList = new ArrayList<>();
  }

  public List<Equipment> getListEquip(AllAmmunitionEnum ammunition) {
    for (int i = 0; i < ammunition.getEquipment().length; i++) {
      equipmentList.add(ammunition.getEquipment()[i]);
    }
    return equipmentList;
  }

  public void printListEquip() {
    System.out.println("Equipment: ");
    for (Equipment equipment : equipmentList) {
      System.out.println(equipment);
    }
  }

  public double getFullPriceAmmunition() {
    double fullPrice = 0;
    for (int i = 0; i < equipmentList.size(); i++) {
      fullPrice += equipmentList.get(i).getCost();
    }
    return fullPrice;
  }

  public void sort() {
    equipmentList.sort(Comparator.<Equipment> reverseOrder());
  }

  public List<Equipment> getEquipmentByCost(double min, double max){
    List<Equipment> equipmentSelected = new ArrayList<>();
    for (Equipment equipment : equipmentList) {
      if(equipment.getCost() >= min && equipment.getCost() <= max){
        equipmentSelected.add(equipment);
      }
    }
    return equipmentSelected;
  }
}
