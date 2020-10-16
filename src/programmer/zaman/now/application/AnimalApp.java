package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
  public static void main(String[] args) {


    Animal animal = new Cat();
    animal.name = "Puss";
    animal.run();

  }
}
