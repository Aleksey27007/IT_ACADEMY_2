package flowershop;

public enum FreshnessLevel {

  FRESH("Fresh", 1),
  MEDIUM_FRESHNESS("Medium freshness", 2),
  BAD("Bad", 3);

  private String freshnessLevel;
  private int level;

  FreshnessLevel(String freshnessLevel, int level) {
    this.freshnessLevel = freshnessLevel;
    this.level = level;
  }

  public String getFreshnessLevel() {
    return freshnessLevel;
  }

  public void setFreshnessLevel(String freshnessLevel) {
    this.freshnessLevel = freshnessLevel;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return freshnessLevel + " " + level;
  }
}
