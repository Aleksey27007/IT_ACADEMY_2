package stones;

import java.util.List;
import stones.necklaces.NecklaceBuilder;
import stones.necklaces.NecklacesEnum;
import stones.stones.Stone;

public class Main {
  /*
  * Камни. Определить иерархию драгоценных и полудрагоценных камней. Отобрать камни для ожерелья.
  * Посчитать общий вес (в каратах) и стоимость. Провести сортировку камней ожерелья на основе ценности.
  * Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.
   */
  public static void main(String[] args) {

    NecklaceBuilder necklace = new NecklaceBuilder();

    /** make necklace **/
    necklace.makeNecklace(NecklacesEnum.DAYBREAK);

    /** sum carat **/
    necklace.calculateCarat();

    /** full price **/
    necklace.calculateCost();

    /** sort by cost **/
    necklace.printInfo();
    necklace.sort();
    necklace.printInfo();

    /** search by params **/
    List<Stone> selectedStones = necklace.getStonesByTransparency(0.3, 0.6);
    System.out.println("---------------------------------------");
    for (Stone stone : selectedStones) {
      System.out.println(stone);
    }

  }
}
