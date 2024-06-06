package new_year_present;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Gift {
  private ArrayList<Confection> confectionsList;

  public Gift() {
    this.confectionsList = createGift();
  }

  public ArrayList<Confection> createGift() {
    this.confectionsList = new ArrayList<>();
    Chocolate chocolate = new Chocolate("Chocolate", 100, 70, "Chocolate");
    this.confectionsList.add(chocolate);
    Candy candy = new Candy("Candy", 2, 1.7f, "Caramel Candy");
    this.confectionsList.add(candy);
    Cookie cookie = new Cookie("Cookie", 15, 10, "Chocolate Cookie");
    this.confectionsList.add(cookie);
    Bar bar = new Bar("Bar", 40, 30, "Chocolate Bar");
    this.confectionsList.add(bar);
    return this.confectionsList;
  }

  public float getGiftWeight() {
    float giftWeight = 0;
    for (int i = 0; i < confectionsList.size(); i++) {
      giftWeight += confectionsList.get(i).getWeight();
    }
    return giftWeight;
  }

  public ArrayList<Confection> getConfectionsList() {
    return confectionsList;
  }

  public void printAListOfSweets() {
    for (int i = 0; i < confectionsList.size(); i++) {
      System.out.println(confectionsList.get(i));
    }
    System.out.println("------------------------------------------------------------");
  }

  public void sortGiftByParameter(int numbParameter) {
    switch (numbParameter) {
      case(1) -> Collections.sort(confectionsList, new Comparator<Confection>() {
        @Override
        public int compare(Confection o1, Confection o2) {
          return (int) (o1.getWeight() - o2.getWeight());
        }
      });
      case(2) -> Collections.sort(confectionsList, new Comparator<Confection>() {
        @Override
        public int compare(Confection o1, Confection o2) {
          return (int) (o1.getSugarLevel() - o2.getSugarLevel() );
        }
      });
      case(3) -> Collections.sort(confectionsList, new Comparator<Confection>() {
        @Override
        public int compare(Confection o1, Confection o2) {
          return o1.getType().compareTo(o2.getType());
        }
      });
    }
  }

  public void findConfectionBySugarRange(int a, int b) {
    for (int i = 0; i < confectionsList.size(); i++) {
      if (a < confectionsList.get(i).getSugarLevel() && confectionsList.get(i).getSugarLevel() < b) {
        System.out.println(confectionsList.get(i));
      }
    }
  }
}
