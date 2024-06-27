package biker;

import biker.ammunition.AllAmmunitionEnum;
import biker.ammunition.Equip;
import biker.equipment.Equipment;
import java.util.List;

public class Main {
  /*
  * Мотоциклист. Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
  * Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены. */

  public static void main(String[] args) {
    Equip biker = new Equip();

    /** motorcyclist's equipment **/
    biker.getListEquip(AllAmmunitionEnum.BIKER);
    biker.printListEquip();

    /** full price ammunition **/
    System.out.println("The full cost of the equipment: " + biker.getFullPriceAmmunition());

    /** sort by weight **/
    biker.sort();
    biker.printListEquip();

    /** search by params **/
    List<Equipment> selectedEquipment = biker.getEquipmentByCost(100, 500);
    System.out.println("---------------------------------------");
    for (Equipment equipment : selectedEquipment) {
      System.out.println(equipment);
    }
  }
}
