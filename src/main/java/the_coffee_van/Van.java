package the_coffee_van;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import the_coffee_van.drinks.CargoEnum;
import the_coffee_van.drinks.Drink;
import the_coffee_van.drinks.DrinkQualityEnum;

public class Van {

  private List<Drink> drinkList;

  public Van() {
    this.drinkList = new ArrayList<>();
  }

  public List<Drink> loadItIntoTheCar(CargoEnum cargo) {
    for (int i = 0; i < cargo.getDrinks().length; i++) {
      drinkList.add(cargo.getDrinks()[i]);
    }
    return drinkList;
  }

  public void printDrinkList() {
    System.out.println("Cargo: ");
    for (Drink drink : drinkList) {
      System.out.println(drink);
    }
  }

  public void sort() {
    drinkList.sort(Comparator.<Drink>reverseOrder());
  }

  public List<Drink> getProductByQuality(DrinkQualityEnum quality) {
    List<Drink> drinkSelected = new ArrayList<>();
    for (Drink drink : drinkList) {
      if (quality.equals(drink.getDrinkQuality())) {
        drinkSelected.add(drink);
      }
    }
    return drinkSelected;
  }
}
