package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public enum Level {
  STANDARD("Standard Level"),
  PREMIUM("Premium Level"),
  VIP("VIP Level");

  private String description;

  Level(String description){
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
