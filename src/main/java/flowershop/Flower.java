package flowershop;

public abstract class Flower {
  private String flowerName;
  private float stemLength;
  private FreshnessLevel freshnessLevel;
  private float cost;
  private int level;

  public Flower(String flowerName, float cost, float stemLength, FreshnessLevel freshnessLevel) {
    this.level = freshnessLevel.getLevel();
    this.cost = cost;
    this.flowerName = flowerName;
    this.stemLength = stemLength;
    this.freshnessLevel = freshnessLevel;
  }

  public float getStemLength() {
    return stemLength;
  }

  public void setStemLength(float stemLength) {
    this.stemLength = stemLength;
  }

  public FreshnessLevel getFreshnessLevel() {
    return freshnessLevel;
  }

  public void setFreshnessLevel(FreshnessLevel freshnessLevel) {
    this.freshnessLevel = freshnessLevel;
  }

  public String getFlowerName() {
    return flowerName;
  }

  public void setFlowerName(String flowerName) {
    this.flowerName = flowerName;
  }

  public float getCost() {
    return cost;
  }

  public void setCost(float cost) {
    this.cost = cost;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "Flower{" +
        "flowerName='" + flowerName + '\'' +
        ", stemLength=" + stemLength +
        ", cost=" + cost +
        ", freshnessLevel=" + freshnessLevel +
        '}' + "\n";
  }
}
