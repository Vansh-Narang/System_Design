public class FactoryPatternDemo {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();
        Shape obj = shapeFactory.getShape("rectangle");
        obj.draw();
        // Shape obj1 = shapeFactory.getShape("arrow");
        // obj1.draw();
    }
}
