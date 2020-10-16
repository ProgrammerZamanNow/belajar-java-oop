package programmer.zaman.now.application;

public class EqualsApp {
  public static void main(String[] args) {


    String first = "Eko";
    first = first + " " + "Khannedy";

    System.out.println(first);

    String second = "Eko Khannedy";
    System.out.println(second);

    System.out.println(first == second);
    System.out.println(first.equals(second));

    String third = "Eko Khannedy";

    System.out.println(second == third);
    System.out.println(second.equals(third));

  }
}
