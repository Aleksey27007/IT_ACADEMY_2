package chef;

import chef.products.Products;
import chef.products.Salads.SaladsEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kitchen {

  private ArrayList<Products> salad;

  public Kitchen() {
    this.salad = new ArrayList<>();
  }

  public void makeSalad(SaladsEnum salad) {
    for (int i = 0; i < salad.getSalad().length; i++) {
      this.salad.add(salad.getSalad()[i]);
    }
  }

  public void makeAListOfIngredients(SaladsEnum salad) {
    System.out.println("Name " + salad.getName() + ":");
    for (int i = 0; i < this.salad.size(); i++) {
      System.out.println(this.salad.get(i));
    }
  }

  public void calculateKcalInSalad() {
    int sumKcal = 0;
    for (int i = 0; i < salad.size(); i++) {
      sumKcal += salad.get(i).getKcalPerNormalWeight();
    }
    System.out.println(sumKcal);
  }

  public ArrayList<Products> getSalad() {
    return salad;
  }

  public void setSalad(ArrayList<Products> salad) {
    this.salad = salad;
  }


  public void sortSaladByParameter(int numbParameter) {
    switch (numbParameter) {
      case (1) -> Collections.sort(salad, new Comparator<Products>() {
        @Override
        public int compare(Products o1, Products o2) {
          return o1.getName().compareTo(o2.getName());
        }
      });
      case (2) -> Collections.sort(salad, new Comparator<Products>() {
        @Override
        public int compare(Products o1, Products o2) {
          return (int) (o1.getWeight() - o2.getWeight());
        }
      });
      case (3) -> Collections.sort(salad, new Comparator<Products>() {
        @Override
        public int compare(Products o1, Products o2) {
          return (int) (o1.getKcalPer100g() - o2.getKcalPer100g());
        }
      });
    }
  }

  public ArrayList findProdInRange(double minCal, double maxCal) {
    ArrayList<Products> result = new ArrayList();

    for (Products component : salad) {
      if (component.getKcalPer100g() >= minCal && maxCal >= component.getKcalPer100g()) {
        result.add(component);
      }
    }
    if (result.isEmpty()) {
      throw new NullPointerException();
    } else {
      return result;
    }
  }
}
