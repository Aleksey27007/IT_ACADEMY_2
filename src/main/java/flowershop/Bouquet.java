package flowershop;

import java.util.List;

public class Bouquet {
  private int id;
  private List<Flower> bouquet;
  private Accessories accessories;
  private float cost;

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

  protected float getCost() {
    float sum = 0;
    for (int i = 0; i < this.bouquet.size(); i++) {

    }
    return sum;
  }

//  protected void addAFlowerToTheBouquet(Flower flower) {
//    this.bouquet.add(flower);
//  }
//
//  protected void removeFlowerFromBouquet(Flower flower) {
//    this.bouquet.remove(flower);
//  }


  @Override
  public String toString() {
    return "Bouquet{" +
        "id=" + id +
        ", bouquet=\n" + bouquet +
        ",\naccessories=" + accessories +
        '}' + "\n";
  }
}
