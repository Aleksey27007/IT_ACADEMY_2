package flowershop;

public enum FreshnessLevel {

  FRESH("Fresh"),
  MEDIUM_FRESHNESS("Medium freshness"),
  BAD("Bad");

  private String freshnessLevel;
  FreshnessLevel(String freshnessLevel) {
    this.freshnessLevel = freshnessLevel;
  }

  public String getFreshnessLevel() {
    return freshnessLevel;
  }

  @Override
  public String toString() {
    return freshnessLevel;
  }
}
