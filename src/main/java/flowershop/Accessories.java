package flowershop;

public enum Accessories {
  RIBBON("Ribbon", 20),
  PACKAGE("Package", 25);

  private String accessories;
  private float cost;

  Accessories(String accessories, float cost) {
    this.accessories = accessories;
    this.cost = cost;
  }

  public String getAccessories() {
    return accessories;
  }

  public void setAccessories(String accessories) {
    this.accessories = accessories;
  }

  public float getCost() {
    return cost;
  }

  public void setCost(float cost) {
    this.cost = cost;
  }
}
