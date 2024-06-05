package flowershop;

import java.util.ArrayList;
import java.util.List;

public class Main {
  /*
  Цветочница. Определить иерархию цветов. Создать несколько объектов-цветов.
  Собрать букет (используя аксессуары) с определением его стоимости.
  Провести сортировку цветов в букете на основе уровня свежести. Найти цветок в букете, соответствующий заданному диапазону длин стеблей.
   */

  public static void main(String[] args) {
    Flower flower1 = new FlowerFirstCategory(FlowerFirstCategoryEnum.PEONIES, 30, FreshnessLevel.BAD);
    Flower flower2 = new FlowerSecondCategory(FlowerSecondCategoryEnum.MATTHIOLA, 60, FreshnessLevel.FRESH);
    Flower flower3 = new FlowerThirdCategory(FlowerThirdCategoryEnum.ASTILBE, 30, FreshnessLevel.MEDIUM_FRESHNESS);


    List<Flower> flowerList = new ArrayList<>();
    flowerList.add(flower1);
    flowerList.add(flower2);
    flowerList.add(flower3);

//    for (Flower flower: flowerList) {
//      System.out.println(flower);
//    }

    Bouquet bouquet1 = new Bouquet(0, flowerList, Accessories.RIBBON);
    /** Стоимость букета **/
    System.out.println(bouquet1.getCost());

    /** Сортировка букета **/
    System.out.println(bouquet1);
    bouquet1.sortBouquet();
    System.out.println(bouquet1);

    /** Нахождение цветка по диапазону длин стеблей**/

    bouquet1.flowerByRangeStemLength(15, 31);
  }
}
