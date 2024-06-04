package flowershop;

public abstract class Flower {
  private String flowerName;
  private float stemLength;
  private FreshnessLevel freshnessLevel;

  public Flower(String flowerName, float stemLength, FreshnessLevel freshnessLevel) {
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

  @Override
  public String toString() {
    return "Flower{" +
        "flowerName='" + flowerName + '\'' +
        ", stemLength=" + stemLength +
        ", freshnessLevel=" + freshnessLevel +
        '}' + "\n";
  }
}
