package flowershop;

public class FlowerFirstCategory extends Flower{
  public FlowerFirstCategory(FlowerFirstCategoryEnum flowerName, FlowerFirstCategoryEnum cost, float stemLength, FreshnessLevel freshnessLevel) {
    super(flowerName.getFlowerName(), stemLength, freshnessLevel);
  }
}
