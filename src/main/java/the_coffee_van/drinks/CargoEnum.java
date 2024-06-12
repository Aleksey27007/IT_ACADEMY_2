package the_coffee_van.drinks;

import the_coffee_van.drinks.coffee.Coffee;
import the_coffee_van.drinks.coffee.coffee_states.CoffeeStatesEnum;

public enum CargoEnum {

  COFFEE_CARGO(new Drink[] {
      new Coffee("Arabica", 250, 8.00, DrinkQualityEnum.SECOND_GRADE, CoffeeStatesEnum.INSTANT_IN_A_JAR),
      new Coffee("Robusta", 400, 6.00, DrinkQualityEnum.HIGHEST_GRADE, CoffeeStatesEnum.GRAIN),
      new Coffee("Liberica", 300, 12.00, DrinkQualityEnum.FIRST_GRADE, CoffeeStatesEnum.GROUND),
      new Coffee("Excelsa", 200, 20.00, DrinkQualityEnum.HIGHEST_GRADE, CoffeeStatesEnum.GRAIN),
      new Coffee("Tipica", 350, 10.00, DrinkQualityEnum.FIRST_GRADE, CoffeeStatesEnum.GRAIN),
      new Coffee("Burbon", 250, 17.00, DrinkQualityEnum.SECOND_GRADE, CoffeeStatesEnum.INSTANT_IN_A_BAG)
  });

  private Drink[] drinks;

  CargoEnum(Drink[] drinks) {
    this.drinks = drinks;
  }

  public Drink[] getDrinks() {
    return drinks;
  }

  public void setDrinks(Drink[] drinks) {
    this.drinks = drinks;
  }
}
