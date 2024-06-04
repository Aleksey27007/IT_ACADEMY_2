package flowershop;

public enum FlowerFirstCategoryEnum {
  PEONIES("peonies", 50),
  PEONY_ROSES("peony roses", 60),
  RANUNCULUS("ranunculus", 50),
  PHALAENOPSIS("phalaenopsis", 75),
  DAHLIAS("dahlias", 50);

  private String flowerName;
  private float cost;

  FlowerFirstCategoryEnum(String flowerName, float cost) {
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
