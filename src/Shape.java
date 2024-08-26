interface Shape {
    String getFillColor();

    String getBorderColor();

    default double getPerimeter() {
        return 0.0;
    }

    default double getArea() {
        return 0.0;
    }
}