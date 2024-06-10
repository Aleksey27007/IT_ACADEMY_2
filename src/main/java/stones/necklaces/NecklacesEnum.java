package stones.necklaces;

import stones.stones.Stone;
import stones.stones.precious_stone.Diamond;
import stones.stones.semi_precious_stone.Amber;
import stones.stones.semi_precious_stone.Turquoise;

public enum NecklacesEnum {

  DAYBREAK("DAYBREAK", new Stone[] {new Diamond("Diamond", 3, 0.5, 980),
      new Turquoise("Turquoise", 5, 0.7, 750), new Amber("Amber", 3, 0.5, 1590),
      new Diamond("Diamond", 3, 0.5, 980), new Turquoise("Turquoise", 5, 0.7, 750)});

  public Stone[] stones;
  private String name;

  NecklacesEnum(String name, Stone[] stones) {
    this.stones = stones;
    this.name = name;
  }

  public Stone[] getStones() {
    return stones;
  }

  public void setStones(Stone[] stones) {
    this.stones = stones;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
