package chef.products.Salads;

import chef.products.Products;
import chef.products.other.Salt;
import chef.products.other.VegetableOil;
import chef.products.vegetables.Beet;
import chef.products.vegetables.Carrot;
import chef.products.vegetables.GreenPeas;
import chef.products.vegetables.Pickle;
import chef.products.vegetables.Potatoes;
import java.util.List;

public enum SaladsEnum {

  VENEGRET(new Products[] {new Beet("Beet", 750, 43), new Pickle("Pickle", 660, 11),
      new Carrot("Carrot", 100, 41), new GreenPeas("GreenPeas", 450, 73),
      new Potatoes("Potatoes", 300, 76), new Salt("Salt", 3, 0), new VegetableOil(
          "Vegetable Oil", 10, 884)}, "VENEGRET");

  public Products[] salad;
  private String name;
  SaladsEnum(Products[] salad, String name) {
    this.salad = salad;
    this.name = name;
  }

  public Products[] getSalad() {
    return salad;
  }

  public void setSalad(Products[] salad) {
    this.salad = salad;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
