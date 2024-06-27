package the_coffee_van.drinks.coffee;

import the_coffee_van.drinks.Drink;
import the_coffee_van.drinks.DrinkQualityEnum;
import the_coffee_van.drinks.coffee.coffee_states.CoffeeStatesEnum;

public class Coffee extends Drink {
  private CoffeeStatesEnum coffeeState;


  public Coffee(String drinkName, double weight, double cost,
      DrinkQualityEnum drinkQuality, CoffeeStatesEnum coffeeState) {
    super(drinkName, weight, cost, drinkQuality);
    this.coffeeState = coffeeState;
  }

  public CoffeeStatesEnum getCoffeeState() {
    return coffeeState;
  }

  public void setCoffeeState(CoffeeStatesEnum coffeeState) {
    this.coffeeState = coffeeState;
  }
}
