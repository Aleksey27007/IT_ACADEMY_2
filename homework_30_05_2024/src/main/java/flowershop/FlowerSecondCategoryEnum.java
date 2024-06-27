package flowershop;

public enum FlowerSecondCategoryEnum {
  SINGLE_HEADED_CLASSIC_ROSES("single-headed classic roses", 50),
  CARNATIONS("carnations", 45),
  MATTHIOLA("matthiola", 40),
  SPRAY_ROSES("spray roses", 45);

  private String flowerName;
  private float cost;

  FlowerSecondCategoryEnum(String flowerName, float cost) {
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
