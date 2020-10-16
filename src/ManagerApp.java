public class ManagerApp {
  public static void main(String[] args) {


    var manager = new Manager("Eko");
    manager.sayHello("Budi");

    var vp = new VicePresident("Joko");
    vp.sayHello("Budi");

    System.out.println(manager);
    System.out.println(manager.toString());
    System.out.println(vp);
    System.out.println(vp.toString());
  }
}
