package flowershop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bouquet {
  private int id;
  private List<Flower> bouquet;
  private Accessories accessories;
//  private Flower flower;

  protected Bouquet(int id, List<Flower> bouquet, Accessories accessories) {
    this.id = id;
    this.bouquet = bouquet;
    this.accessories = accessories;
  }

  protected int getId() {
    return id;
  }

  protected void setId(int id) {
    this.id = id;
  }

  protected List<Flower> getBouquet() {
    return bouquet;
  }

  protected void setBouquet(List<Flower> bouquet) {
    this.bouquet = bouquet;
  }

  protected Accessories getAccessories() {
    return accessories;
  }

  protected void setAccessories(Accessories accessories) {
    this.accessories = accessories;
  }

  protected void flowerByRangeStemLength(int A, int B) {
    for (int i = 0; i < bouquet.size(); i++) {
      if (this.bouquet.get(i).getStemLength() > A & this.bouquet.get(i).getStemLength() < B) {
        System.out.println(bouquet.get(i));
      }
    }
  }

  protected float getCost() {
    float sum = 0;
    for (int i = 0; i < this.bouquet.size(); i++) {
      sum += bouquet.get(i).getCost();
    }
    sum += this.accessories.getCost();
    return sum;
  }

  protected void sortBouquet() {
    Collections.sort(this.bouquet, new Comparator<Flower>() {
      @Override
      public int compare(Flower o1, Flower o2) {
        return o1.getLevel() - o2.getLevel();
      }
    });
  }
  @Override
  public String toString() {
    return "Bouquet{" +
        "id=" + id +
        ", bouquet=\n" + bouquet +
        ",\naccessories=" + accessories +
        '}' + "\n";
  }
}
