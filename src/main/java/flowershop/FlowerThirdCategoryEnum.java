package flowershop;

public enum FlowerThirdCategoryEnum {
  BRUNIA("brunia", 30),
  ASTILBE("astilbe", 25),
  ERYNGIUM("eryngium", 40),
  SPEEDWELL("speedwel", 35);

  private String flowerName;
  private float cost;

  FlowerThirdCategoryEnum(String flowerName, float cost) {
    this.flowerName = flowerName;
    this.cost = cost;
  }

  public String getFlowerName() {
    return flowerName;
  }

  public float getCost() {
    return cost;
  }

  @Override
  public String toString() {
    return "flowerName='" + flowerName + '\'' +
        ", cost=" + cost;
  }
}
