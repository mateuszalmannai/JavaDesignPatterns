package designPatternEssentials.foobarMotorCompany.structural.composite;

public class CompositeClient {

  public static void main(String[] args) {
    final Item nut = new Part("Nut", 5);
    final Item bolt = new Part("Bolt", 9);
    final Item panel = new Part("Panel", 35);

    final Assembly gizmo = new Assembly("Gizmo");
    gizmo.addItem(panel);
    gizmo.addItem(nut);
    gizmo.addItem(bolt);

    final Item widget = new Assembly("Widget");
    widget.addItem(gizmo);
    widget.addItem(nut);

    System.out.println(nut);
    System.out.println(bolt);
    System.out.println(panel);
    System.out.println(gizmo);
    System.out.println(widget);
  }
}
