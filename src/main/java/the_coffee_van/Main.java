package the_coffee_van;

import java.util.List;
import the_coffee_van.drinks.CargoEnum;
import the_coffee_van.drinks.Drink;
import the_coffee_van.drinks.DrinkQualityEnum;

public class Main {
  /*
  * Фургон кофе. Загрузить фургон определенного объема грузом на определенную сумму из различных сортов кофе,
  * находящихся в тому же в разных физических состояниях (зерно, молотый, растворимый в банках и пакетиках).
  * Учитывать объем кофе вместе с упаковкой. Провести сортировку товаров на основе соотношения цены и веса.
  * Найти товар в фургоне, соответствующий заданному диапазону параметров качества.
   */

  public static void main(String[] args) {

    Van coffeeVan = new Van();

    coffeeVan.loadItIntoTheCar(CargoEnum.COFFEE_CARGO);

    coffeeVan.printDrinkList();

    coffeeVan.sort();
    coffeeVan.printDrinkList();

    List<Drink> selectedDrinks = coffeeVan.getProductByQuality(DrinkQualityEnum.FIRST_GRADE);
    System.out.println("---------------------------------------");
    for (Drink drink : selectedDrinks) {
      System.out.println(drink);
    }
  }
}
