public class ShapeApp {
  public static void main(String[] args) {


    var shape = new Shape();
    System.out.println(shape.getCorner());

    var rectangle = new Rectangle();
    System.out.println(rectangle.getCorner());
    System.out.println(rectangle.getParentCorner());

  }
}
