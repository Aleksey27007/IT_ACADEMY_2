package flowershop;

public class FlowerSecondCategory extends Flower{
  public FlowerSecondCategory(FlowerSecondCategoryEnum flowerName, float stemLength, FreshnessLevel freshnessLevel) {
    super(flowerName.getFlowerName(),flowerName.getCost(), stemLength, freshnessLevel);
  }
}
