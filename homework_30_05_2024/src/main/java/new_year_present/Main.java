package new_year_present;

import java.util.Collections;

public class Main {

  /*
  Новогодний подарок. Определить иерархию конфет и прочих сладостей. Создать несколько объектов-конфет.
  Собрать детский подарок с определением его веса. Провести сортировку конфет в подарке на основе одного из параметров.
  Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
   */

  public static void main(String[] args) {

    Gift gift = new Gift();
    gift.printAListOfSweets();

    float giftWeight = gift.getGiftWeight();
    System.out.println(giftWeight);

    /** sort by name **/
    Collections.sort(gift.getConfectionsList());
    gift.printAListOfSweets();

    /** sort by 1: weight, 2: sugar_level, 3: type**/
    gift.sortGiftByParameter(1);
    gift.printAListOfSweets();
    gift.sortGiftByParameter(2);
    gift.printAListOfSweets();
    gift.sortGiftByParameter(3);
    gift.printAListOfSweets();

    /** find confection by sugar range **/
    gift.findConfectionBySugarRange(1, 5);
  }
}
