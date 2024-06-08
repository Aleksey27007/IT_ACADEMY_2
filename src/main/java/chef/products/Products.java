package chef.products;

public class Products {
  private String name;
  private double weight;
  private double kcalPer100g;

  public Products(String name, double weight, double kcalPer100g) {
    this.name = name;
    this.weight = weight;
    this.kcalPer100g = kcalPer100g;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getKcalPer100g() {
    return kcalPer100g;
  }
  public double getKcalPerNormalWeight() {
    double kcal = 0;
    if (kcalPer100g > 100 || kcalPer100g < 100) {
      kcal += (weight / 100) * kcalPer100g;
    }
    return kcal;
  }

  public void setKcalPer100g(double kcalPer100g) {
    this.kcalPer100g = kcalPer100g;
  }

  @Override
  public String toString() {
    return "name: " + name  +
        ", weight: " + weight +
        ", kcalPer100g: " + kcalPer100g;
  }
}
