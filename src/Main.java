public class Main {
    public static void main(String[] args) {
        // 1 задание
        Кот[] коты = new Кот[3];
        коты[0] = new Кот();
        коты[1] = new Кот();
        коты[2] = new Кот();

        Миска миска = new Миска(2);

        for (Кот кот : коты) {
            кот.покушать(миска);

        }

        for (int i = 0; i < коты.length; i++) {
            System.out.println("Кот " + (i + 1) + " сытый: " + коты[i].isСытость());
        }

        миска.добавьЕду(3);

        коты[1].покушать(миска);

        Собака собака = new Собака();
        собака.бег(400);
        собака.бег(600);
        собака.плавание(5);
        собака.плавание(15);

        System.out.println("Общее количество животных: " + Животное.getCount());
        System.out.println("Количество котов: " + Кот.getКотCount());
        System.out.println("Количество собак: " + Собака.getСобакаCount());

        // 2 задание
        Shape circle = new Circle(5.0, "red", "black");
        Shape rectangle = new Rectangle(4.0, 6.0, "blue", "green");
        Shape triangle = new Triangle(3.0, 4.0, 5.0, "yellow", "purple");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);

    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Фигура: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}