package the_coffee_van.drinks;

import mobile_communication.mobile_company.Rates;

public class Drink implements Comparable<Drink> {

  private String drinkName;
  private double weight;
  private double cost;
  private DrinkQualityEnum drinkQuality;

  public Drink(String drinkName, double weight, double cost, DrinkQualityEnum drinkQuality) {
    this.drinkName = drinkName;
    this.weight = weight;
    this.cost = cost;
    this.drinkQuality = drinkQuality;
  }

  public String getDrinkName() {
    return drinkName;
  }

  public void setDrinkName(String drinkName) {
    this.drinkName = drinkName;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public DrinkQualityEnum getDrinkQuality() {
    return drinkQuality;
  }

  public void setDrinkQuality(DrinkQualityEnum drinkQuality) {
    this.drinkQuality = drinkQuality;
  }

  @Override
  public String toString() {
    return "Drink{" +
        "drinkName='" + drinkName + '\'' +
        ", weight=" + weight +
        ", cost=" + cost +
        ", drinkQuality=" + drinkQuality +
        '}';
  }


  @Override
  public int compareTo(Drink obj) {
    int result = (int) (this.getCost() - obj.getCost());
    if (result != 0) {
      return result;
    } else {
      return (int) (this.getWeight() - obj.getWeight());
    }
  }
}
